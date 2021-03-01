FROM adoptopenjdk/openjdk11:jdk-11.0.7_10-alpine-slim

LABEL system="local" \
    name="local-ms-evaluation" \
    mantainer="cesar.casasola" \
    type="microservice"

RUN apk add --update tzdata
ENV TZ=America/Lima
COPY ./build/libs/*.jar app.jar
EXPOSE 7166
ENTRYPOINT ["java","-jar","/app.jar"]