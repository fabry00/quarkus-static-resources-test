#!/bin/bash

set -x
docker --version

docker rm -f rest-resources-static-resources || true
docker rmi -f quarkus-quickstart/rest-resources-static-resources || true
docker build --no-cache -f src/main/docker/Dockerfile.multistage -t quarkus-quickstart/rest-resources-static-resources .
