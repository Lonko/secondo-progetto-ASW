#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka_server_img_9004
docker push ${DOCKER_REGISTRY}/info_attore_cloud_img_9004
docker push ${DOCKER_REGISTRY}/numero_film_cloud_img_9004
docker push ${DOCKER_REGISTRY}/main_service_cloud_img_9004
docker push ${DOCKER_REGISTRY}/zuul_img_9004