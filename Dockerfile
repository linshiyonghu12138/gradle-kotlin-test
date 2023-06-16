FROM joengenduvel/jre17 AS build

WORKDIR app

COPY ./build/libs/kotlin-demo-0.0.1-SNAPSHOT.jar /app/app.jar

CMD java -jar /app/app.jar
