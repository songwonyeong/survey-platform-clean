FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
COPY . /app

RUN ./gradlew build

EXPOSE 8080

CMD ["java", "-jar", "build/libs/survey-platform-0.0.1-SNAPSHOT.jar"]
