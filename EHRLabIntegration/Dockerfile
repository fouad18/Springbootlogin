#Centos7 as the base OS 
FROM openshift/base-centos7

               
#Running the commands as root
USER root           

#Installing node,jdk,maven 
RUN yum install -y java-1.8.0-openjdk-devel epel-release \
    && yum install -y nodejs npm \
               
#Exposing 4200 for nodeJS            
EXPOSE 4200


#Checking the node and java version
RUN  npm -v \
     && java -version \
     && node –v

