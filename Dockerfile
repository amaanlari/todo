FROM maven:3.9.7-eclipse-temurin-21 AS build
COPY . .
#WORKDIR /home/app
#COPY ./pom.xml /home/app/pom.xml
#COPY ./src/main/java/com/lari/todo/TodoApplication.java /home/app/src/main/java/com/lari/todo/TodoApplication.java
RUN mvn -f spring-boot:build-image

FROM openjdk:21-slim
LABEL authors="amaan"
COPY --from=build target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]

