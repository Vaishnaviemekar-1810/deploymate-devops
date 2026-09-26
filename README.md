# DeployMate – Automated CI/CD and Self-Healing Application Deployment Platform

## Project Overview

DeployMate is a DevOps project designed to automate the process of building, containerizing, and deploying a Spring Boot application.

The project integrates Git, GitHub, Maven, Jenkins, Docker, and Kubernetes to create an automated CI/CD workflow. Kubernetes is also used to demonstrate application deployment, replica management, and self-healing.

## Objectives

* Automate the application build process using Maven.
* Manage source code using Git and GitHub.
* Implement CI/CD using Jenkins.
* Containerize the application using Docker.
* Deploy the application using Kubernetes.
* Manage multiple application instances using Kubernetes.
* Demonstrate Kubernetes self-healing.
* Reduce manual deployment activities.
* Gain practical hands-on experience with DevOps tools.

## Technologies Used

* Java 17
* Spring Boot
* Maven
* Git
* GitHub
* Jenkins
* Docker
* Kubernetes
* Kind
* YAML

## Project Workflow

The DeployMate workflow starts with source code stored in GitHub. Jenkins retrieves the source code and triggers the CI/CD pipeline. Maven builds and packages the Spring Boot application. Docker then creates a container image from the application. The application is deployed to a Kubernetes cluster created using Kind. Kubernetes manages the application Pods and Service.

**Workflow:**

GitHub → Jenkins → Maven → Docker → Kubernetes → Pods → Service → Application

## Spring Boot Application

DeployMate is developed using Java 17 and Spring Boot. Maven is used for dependency management and application packaging.

The application runs on port **8081**.

## Git and GitHub

Git is used for version control, while GitHub is used to store and manage the project source code.

The project source code is maintained in a GitHub repository and serves as the source for the Jenkins CI/CD pipeline.

## Maven

Maven is used to build and package the Spring Boot application.

The Maven build process compiles the source code, runs tests, and generates the application JAR file.

## Docker

Docker is used to containerize the DeployMate application.

A Dockerfile defines the environment required to run the application. The generated Spring Boot JAR file is copied into the Docker image and executed inside the container.

## Jenkins CI/CD

Jenkins is used to automate the application deployment workflow.

The Jenkins pipeline performs the following stages:

1. Checkout the source code from GitHub.
2. Build the application using Maven.
3. Create the Docker image.
4. Run the Docker container.

This automation reduces manual steps and provides a consistent application build and deployment process.

## Kubernetes

Kubernetes is used as the container orchestration platform for DeployMate.

A local Kubernetes cluster is created using Kind. The application is deployed using a Kubernetes Deployment with two replicas.

The Deployment ensures that the required number of application Pods are maintained.

## Kubernetes Pods

Pods are the basic execution units of the DeployMate application in Kubernetes.

Two replicas of the application are maintained by the Deployment. Each Pod runs a container containing the DeployMate application.

## Kubernetes Service

A Kubernetes Service provides network access to the DeployMate application Pods.

The application is exposed using a NodePort Service and can be accessed locally through port forwarding.

## Kubernetes Self-Healing

DeployMate demonstrates the self-healing capability of Kubernetes.

The Deployment is configured to maintain two application replicas. If one Pod is deleted or becomes unavailable, Kubernetes detects that the desired number of replicas has not been maintained and automatically creates a replacement Pod.

This demonstrates Kubernetes' ability to maintain the desired state of an application.

## Project Structure

```text
deploymate/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │
│   └── test/
│
├── k8s/
│   └── deployment.yaml
│
├── Dockerfile
├── Jenkinsfile
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Conclusion

DeployMate demonstrates an end-to-end DevOps workflow by integrating source code management, build automation, CI/CD, containerization, and container orchestration.

The project provides practical experience in integrating GitHub, Maven, Jenkins, Docker, and Kubernetes into a single automated deployment workflow while demonstrating Kubernetes self-healing capabilities.
