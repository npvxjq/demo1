FROM openjdk:11.0.14-jre
VOLUME /tmp
EXPOSE 8080
COPY build/libs/demo1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
