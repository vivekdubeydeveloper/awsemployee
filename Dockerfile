FROM openjdk:8
EXPOSE 8080
ADD target/awsemployee-0.0.1-SNAPSHOT.jar awsemployee-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/awsemployee-0.0.1-SNAPSHOT.jar"]