# Dockerfile per zuul

FROM frolvlad/alpine-oraclejdk8 

ADD target/zuul-0.0.1-SNAPSHOT.jar zuul.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "zuul.jar"]