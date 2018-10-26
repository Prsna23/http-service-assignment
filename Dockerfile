FROM java:openjdk-8
MAINTAINER prsna23
COPY "./target/scala-2.11/HttpHelloWorld-assembly-0.1.jar" "./app/HttpHelloWorld-assembly-0.1.jar"
WORKDIR /app
ENTRYPOINT ["java", "-jar", "HttpHelloWorld-assembly-0.1.jar"]


