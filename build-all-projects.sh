#Script per il build di tutti i progetti
#Dev'essere lanciato dalla directory principale

mvn -f ./eurekaServer/pom.xml clean package
mvn -f ./mainServiceCloud/pom.xml clean package
mvn -f ./numeroFilmCloud/pom.xml clean package
mvn -f ./infoAttoreCloud/pom.xml clean package
mvn -f ./zuul/pom.xml clean package