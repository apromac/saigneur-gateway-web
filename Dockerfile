# ======================================================================
# DOCKERFILE
# CONSTRUCTION DE L'IMAGE DOCKER DU MICROSERVICE "saigneur-gateway-web"
# ======================================================================
FROM adoptopenjdk/openjdk11:alpine-slim
LABEL maintainer = "apromac <abraham.tiene@apromac.ci>"

RUN mkdir /usr/local/microservice \
&& mkdir /usr/local/microservice/msaigneur

WORKDIR /usr/local/microservice/msaigneur
COPY target/*.jar saigneur-gateway-web.jar

EXPOSE 9001
ENTRYPOINT ["java", "-jar", "saigneur-gateway-web.jar"]
