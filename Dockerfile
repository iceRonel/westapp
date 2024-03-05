FROM eclipse-temurin:17-jdk-alpine
WORKDIR /home/user
ENV JAVA_OPTS="-Dspring.profiles.active=default,prod"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar app.jar" ]
COPY target/ronel-0.0.1-SNAPSHOT.jar app.jar