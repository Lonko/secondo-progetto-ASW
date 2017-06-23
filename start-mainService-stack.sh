#!/bin/bash

echo 'Starting mainService application as a stack' 

source "docker.env"

docker stack deploy --compose-file docker-stack-mainService.yml main-service-9004