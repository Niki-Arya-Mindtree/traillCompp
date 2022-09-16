FROM openjdk:8
EXPOSE 8025
ADD target/StudentMS6-1.jar app.jar
ENTRYPOINT ["java","-jar","/springboot-crud-k8s.jar"]