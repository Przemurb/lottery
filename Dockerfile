FROM maven:3.8.6-openjdk-18-slim AS MAVEN_VERSION
COPY . /
RUN maven package

FROM openjdk:17.0.2-slim-buster
EXPOSE 8080
COPY --from=MAVEN_VERSION /target/lottery-*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
