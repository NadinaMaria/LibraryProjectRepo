FROM openjdk:17-jdk-alpine AS appimage
EXPOSE 8080
#ARG JAR_FILE=./target/LibraryProject-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} /LibraryProject-0.0.1-SNAPSHOT.jar
COPY target/LibraryProject-0.0.1-SNAPSHOT.jar tmp/LibraryProject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "tmp/LibraryProject-0.0.1-SNAPSHOT.jar"]


FROM cassandra:latest AS databaseimage
EXPOSE 9042
WORKDIR tmp
#COPY ./data.cql /data.cql
COPY ./data.sh /data.sh
COPY ./init.sh /init.sh
RUN chmod +x /data.sh
#RUN chmod +x /data.cql
RUN chmod +x /init.sh
#CMD ["cqlsh", "-f", "data.cql"]
#ENTRYPOINT ["/bin/bash", "home/data.sh"]
#CMD ["cassandra", "-f"]


