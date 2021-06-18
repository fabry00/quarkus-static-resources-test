#!/bin/bash

docker rm -f rest-resources-static-resources || true
docker run --name rest-resources-static-resources -p 8080:8080 quarkus-quickstart/rest-resources-static-resources