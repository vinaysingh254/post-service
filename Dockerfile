FROM openjdk:11
EXPOSE 80
ADD target/post-service-*.jar vstech-app.jar
ENTRYPOINT ["java", "-jar", "vstech-app.jar"]