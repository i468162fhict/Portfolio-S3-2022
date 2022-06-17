# Which platform to use:
FROM openjdk:18
# Which ports to open to public:
EXPOSE 8080
# Add project to the Docker:
ADD target/pokemon-basim.jar pokemon-basim.jar

ENTRYPOINT ["java","-jar","/pokemon-basim.jar"]