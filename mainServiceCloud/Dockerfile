# Dockerfile per mainServiceCloud

FROM frolvlad/alpine-oraclejdk8 

ADD target/mainServiceCloud-0.0.1-SNAPSHOT.jar mainServiceCloud.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java"]

CMD ["-jar", "mainServiceCloud.jar"]