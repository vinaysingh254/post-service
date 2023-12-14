#!/usr/bin/env bash

mvn clean install -DskipTests
docker build -t eks/my-post-service:latest .
docker run -p 8080:8085 eks/my-post-service:latest
