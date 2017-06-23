#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka-server-img-9004 ./eurekaServer
docker build --rm -t ${DOCKER_REGISTRY}/info-attore-cloud-img-9004 ./infoAttoreCloud
docker build --rm -t ${DOCKER_REGISTRY}/numero-film-cloud-img-9004 ./numeroFilmCloud 
docker build --rm -t ${DOCKER_REGISTRY}/main-service-cloud-img-9004 ./mainServiceCloud  
docker build --rm -t ${DOCKER_REGISTRY}/zuul-img-9004 ./zuul