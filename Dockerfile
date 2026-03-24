FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/shopping-cart.jar app.jar

CMD ["java", "-jar", "app.jar"]