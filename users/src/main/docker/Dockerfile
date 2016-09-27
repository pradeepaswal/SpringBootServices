FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD users-1.0.1-RELEASE.jar app.jar
RUN sh -c 'touch /awspoc.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]