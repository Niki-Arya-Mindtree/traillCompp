FROM maven:latest
COPY . .
EXPOSE 80
COPY ./pom.xml ./pom.xml
COPY /target/CompTrail-1.jar app.jar
CMD java -jar app.jar