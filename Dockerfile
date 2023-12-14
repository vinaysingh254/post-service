FROM openjdk:11
ADD target/post-service-*.jar vstech-app.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "vstech-app.jar"]