package com.optum.EHRLabIntegration.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.ldap.userdetails.LdapUserDetailsImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private static Logger log = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String displayDashboard(HttpServletRequest httpServletRequest) {

		log.info("Getting UsernamePasswordAuthenticationToken from SecurityContextHolder");
		UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder
				.getContext().getAuthentication();
		
		log.info("Getting principal from UsernamePasswordAuthenticationToken");
		LdapUserDetailsImpl principal = (LdapUserDetailsImpl) authentication.getPrincipal();
		log.info("authentication: " + authentication);
		log.info("principal: " + principal);
		httpServletRequest.getSession().setAttribute("user", principal.getUsername());
		return principal.getUsername();
	}

}