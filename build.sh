#!/usr/bin/env bash

mvn clean install -DskipTests
docker build -t vstech-app .
docker run -p 8080:8085 vstech-app
