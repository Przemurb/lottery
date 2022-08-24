FROM maven:latest AS MAVEN_VERSION
COPY . /
RUN mvn package

FROM openjdk:slim-buster
EXPOSE 8080
COPY --from=MAVEN_VERSION /target/lottery-*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
