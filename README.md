# Mini CI/CD Pipeline with GitHub Actions

Small Java + Maven project created to learn and practice modern CI/CD workflows using GitHub Actions and Docker.

## Features

- Java 21 + Maven project
- Unit testing with JUnit 5
- Automated testing on every push
- Automated JAR build
- Docker image build inside the CI pipeline
- Artifact upload using GitHub Actions

## CI/CD Flow

```text
git push
   ↓
GitHub Actions
   ├── Run tests
   ├── Build JAR
   ├── Build Docker image
   └── Upload artifact
```
## Technologies
- Java 21
- Maven
- JUnit 5
- Docker
- GitHub Actions
