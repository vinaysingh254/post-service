FROM openjdk:17-jdk-slim
ADD target/post-service-*.jar post-service.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "post-service.jar"]