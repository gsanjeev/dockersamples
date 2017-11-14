FROM openjdk:8-jdk-alpine
#VOLUME /tmp
WORKDIR /f/data/working/docker
EXPOSE 8080
ADD target/SimpleDocker.jar /f/data/working/docker/app.jar
ENV JAVA_OPTS=""
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
ENTRYPOINT exec java -jar /app.jar