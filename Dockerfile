FROM maven:3.9.7-eclipse-temurin-21 AS build
WORKDIR /home/app

COPY ./pom.xml /home/app/pom.xml
COPY ./src/main/java/com/lari/todo/TodoApplication.java /home/app/src/main/java/com/lari/todo/TodoApplication.java

RUN mvn -f /home/app/pom.xml clean package

COPY . /home/app

RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:21-slim
LABEL authors="amaan"
COPY --from=build /home/app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]
