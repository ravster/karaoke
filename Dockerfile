FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/test-lum.jar /test-lum/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/test-lum/app.jar"]
