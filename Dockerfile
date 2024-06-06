FROM openjdk:17-jdk
ARG JAR_FILE=build/libs/docker-compose-sample-0.0.1-SNAPSHOT.jar
ADD **/**/${JAR_FILE} testApp.jar
ENTRYPOINT ["java", "-jar", "/testApp.jar"]