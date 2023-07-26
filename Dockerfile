FROM openjdk:8

EXPOSE 8282

ADD target/docker-demo.jar docker-demo.jar

ENTRYPOINT ["java", "-jar", "docker-demo.jar"]