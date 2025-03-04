# unsplash-api-service

A simple reactive application for Unsplash API testing

#### Pre-requisites

* You'll have to have Docker installed
* JDK 17

#### Running in IDE locally

You'll need MongoDB running on your machine. A simple way to do so is to run the MongoDB instance on Docker

Run a MongoDB instance on Docker

`docker run -d -p 27017:27017 --name mongo mongo:latest`

After the container starts up, you should be able to run the app in your IDE

---

#### Running inside Docker environment

Clean built resources, code format and build (you could just run ```build```, but add the other two just in case)

`./gradlew clean spotlessApply build`

After this, you're good to go with the Docker step

Running this should build the Dokcer image based on your Gradle built application JAR, pull the MongoDB image if it
doesn't exist locally, and run two containers

`docker-compose up`


After booting up the application the OpenAPI Swagger page will be available by the following link:
http://localhost:8080/swagger-ui/index.html