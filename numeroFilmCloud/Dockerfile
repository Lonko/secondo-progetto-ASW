# Dockerfile per numeroFilmCloud

FROM frolvlad/alpine-oraclejdk8 

ADD target/numeroFilmCloud-0.0.1-SNAPSHOT.jar numeroFilmCloud.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java"]

CMD ["-jar", "numeroFilmCloud.jar"]