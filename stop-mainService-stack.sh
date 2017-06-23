#!/bin/bash

echo 'Removing mainService application as a stack' 

source "docker.env"

docker stack rm main-service-9004