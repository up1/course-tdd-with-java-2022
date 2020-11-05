FROM openjdk:8-jdk-alpine AS BUILD_STAGE
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build.gradle settings.gradle gradlew $APP_HOME
COPY gradle $APP_HOME/gradle
RUN chmod +x gradlew
RUN ./gradlew build || return 0
COPY . .
RUN chmod +x gradlew
RUN ./gradlew clean test
RUN ./gradlew jacocoTestReport
RUN ./gradlew build



FROM openjdk:8-jdk-alpine
ENV JAR_FILE=demo-spring-boot-gradle-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=BUILD_STAGE $APP_HOME/build/libs/$JAR_FILE ./app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]