FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
ENV TZ=America/Lima
COPY ${JAR_FILE} app.jar
EXPOSE 7166
ENTRYPOINT ["java","-jar","/app.jar"]