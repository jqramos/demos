FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} web.jar

EXPOSE 7171

ENTRYPOINT ["java","-jar","/app.jar"]
