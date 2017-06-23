#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka_server_img_9004 ./eurekaServer
docker build --rm -t ${DOCKER_REGISTRY}/info_attore_cloud_img_9004 ./infoAttoreCloud
docker build --rm -t ${DOCKER_REGISTRY}/numero_film_cloud_img_9004 ./numeroFilmCloud 
docker build --rm -t ${DOCKER_REGISTRY}/main_service_cloud_img_9004 ./mainServiceCloud  
docker build --rm -t ${DOCKER_REGISTRY}/zuul_img_9004 ./zuul