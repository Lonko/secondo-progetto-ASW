# Dockerfile per infoAttoreCloud

FROM frolvlad/alpine-oraclejdk8 

ADD target/infoAttoreCloud-0.0.1-SNAPSHOT.jar infoAttoreCloud.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "infoAttoreCloud.jar"]