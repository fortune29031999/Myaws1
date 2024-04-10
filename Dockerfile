FROM eclipse-temurin:17
COPY target/Myaws.jar Myaws.jar
CMD [ "java","-jar","Myaws.jar" ]