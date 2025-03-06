FROM openjdk:17
EXPOSE 8080
ADD target/devops-sample.jar
ENTRYPOINT ["java", "-jar","/devops-sample.jar"]
