FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
WORKDIR .
COPY target/*.jar app.jar
EXPOSE 8080
CMD ["sh", "-c", "sleep 30 && java -jar /app.jar"]
