#Use an official JDK runtime as a parent image
FROM openjdk:17-jdk-alpine

#Set the working directory in the container
ARG JAR_FILE=target/*.jar

#Copy the executable JAR file from your local machine to the contaner
COPY ./target/TManagement-0.0.1-SNAPSHOT.jar app.jar

#Expose the port your Spring Boot app runs on
EXPOSE 8080

#RUn the JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]