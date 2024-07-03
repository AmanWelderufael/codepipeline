# Use the official Maven image to create a build artifact.
# This stage is to build the application
FROM maven:3.8.1-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

# Use the official OpenJDK image for a minimal Java runtime
# This stage is to run the application
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/TManagement-0.0.1-SNAPSHOT.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/app/app.jar"]



