package com.optum.EHRLabIntegration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@EnableWebSecurity
public class SpringWebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/img/**",
                "/css/**",
                "/fonts/**",
                "/font/**",
                "/favicon.ico",
                "/js/**")
                .addResourceLocations(
                        "classpath:/templates/img/",
                        "classpath:/templates/css/",
                        "classpath:/templates/fonts/",
                        "classpath:/templates/font/",
                        "classpath:/templates/font/",
                        "classpath:/templates/img/favicon.ico",
                        "classpath:/templates/js/");
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/login");
    }
    
}