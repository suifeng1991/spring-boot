FROM java:8
VOLUME /tmp
ADD springboot-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090

ENTRYPOINT ["java","-jar","app.jar"]
