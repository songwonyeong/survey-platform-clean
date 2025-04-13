FROM eclipse-temurin:17-jdk-alpine

# Gradle 설치
RUN apk add --no-cache curl unzip \
    && curl -sSL https://services.gradle.org/distributions/gradle-8.5-bin.zip -o gradle.zip \
    && unzip gradle.zip -d /opt \
    && rm gradle.zip \
    && ln -s /opt/gradle-8.5/bin/gradle /usr/bin/gradle

WORKDIR /app
COPY . /app

# ✅ 테스트 생략하고 빌드
RUN gradle build -x test

EXPOSE 8080

CMD ["java", "-jar", "build/libs/survey-platform-0.0.1-SNAPSHOT.jar"]
