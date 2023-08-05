FROM --platform=linux/amd64 openjdk:17-alpine3.14

WORKDIR /app

COPY target/inventory-0.0.1-SNAPSHOT.jar /app/inventory-app.jar

EXPOSE 8081

CMD ["java", "-jar", "/app/inventory-app.jar"]
