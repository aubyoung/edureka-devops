FROM devopsedu/webapp
RUN apt-get update -y
RUN apt-get install git -y
RUN git clone https://github.com/edureka-devops/projCert.git
RUN cp -r projCert/website/* /var/www/html
CMD apachectl -D FOREGROUND
