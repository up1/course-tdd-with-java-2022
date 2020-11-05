# How to run ?

## Run test and coverage with jacoco

```
$gradlew clean test
```

## Run coverage report with Jacoco

```
$gradlew jacocoTestReport
```

- HTML report in `build/reports/jacoco/test/html/index.html`
- Jacoco result in `build/jacoco/test.exec`

## Start Development server

```
$gradlew bootRun
```

## Working with SonarQube

```
$gradlew sonarqube
```

## Run with Docker

```
# build docker
$docker image build -t demo-spring-boot-gradle .
```

```
# run docker
$docker container run -d -p 8080:8080 demo-spring-boot-gradle
```
