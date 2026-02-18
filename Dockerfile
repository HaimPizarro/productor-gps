FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

COPY target/productor-gps-0.0.1-SNAPSHOT.jar app.jar

# Ejecutamos
ENTRYPOINT ["java","-jar","/app.jar"]