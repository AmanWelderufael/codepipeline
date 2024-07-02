# Use an official JDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from your local machine to the container
COPY ./target/TManagement-0.0.1-SNAPSHOT.jar app.jar

# copy application properties file to the container
COPY src/main/resources/application.properties /app/application.properties

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
