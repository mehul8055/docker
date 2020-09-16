FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-demo.jar
ENTRYPOINT ["java","-jar","/docker-demo.jar"]
