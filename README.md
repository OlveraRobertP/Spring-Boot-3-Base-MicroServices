
# Project Description

## Base Template for Creating Microservices Projects with Spring Boot

This template provides an initial structure for creating microservices projects using Spring Boot. It is designed to serve as a foundation for other projects, facilitating the configuration and deployment of a set of essential services.

## Included Components

- **Config Server**: Centralized configuration server to manage the configurations of microservices.
- **Eureka Server**: Service discovery for detecting and registering microservices.
- **API Gateway**: API router that acts as a unified entry point for microservices.

## Technologies Used

- **Spring Boot**: Version 3.3.1
- **Java**: Version 17
- **Maven**: Build and dependency management tool.

## Project Configuration

To correctly run the project, the following environment variables must be defined:

- **CONFIG_REPO_URI**: URL of the repository containing the configuration files.
  ```plaintext
  CONFIG_REPO_URI=https://github.com/OlveraRobertP/moneysensei-config
  ```
- **SPRING_PROFILES_ACTIVE**: Active Spring profile.
  ```plaintext
  SPRING_PROFILES_ACTIVE=dev
  ```

The configurations for each microservice can be found in the following repository:
[Configuration Repository](https://github.com/OlveraRobertP/moneysensei-config)

## Test Microservice

A test microservice named `test-service` is included, exposing a test controller at the following endpoint:
```plaintext
http://localhost:8080/test-service/api/test?input=hello
```

## Execution Order

To start the services, it is recommended to follow this order:

1. Config Server
2. Eureka Server
3. API Gateway
4. Other microservices

## Additional Instructions

- Ensure the environment variables are configured before starting the services.
- Verify that the configured ports are not in use by other services.
- Refer to the documentation of each component for specific adjustments and customizations.
