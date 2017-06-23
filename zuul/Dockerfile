# Dockerfile per l'applicazione sentence / eureka server 

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/zuul-0.0.1-SNAPSHOT.jar zuul.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java"]

CMD ["-jar", "zuul.jar"]