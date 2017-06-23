# Dockerfile per eurekaServer

FROM frolvlad/alpine-oraclejdk8 

ADD target/eurekaServer-0.0.1-SNAPSHOT.jar eurekaServer.jar

EXPOSE 8761

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "eurekaServer.jar"]