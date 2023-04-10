FROM openjdk:17
EXPOSE 8080
COPY target/Mock-0.0.1-SNAPSHOT.jar Mock-0.0.1-SNAPSHOT.jar
CMD [ "java","-jar","Mock-0.0.1-SNAPSHOT.jar" ]