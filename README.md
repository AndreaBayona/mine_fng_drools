# mine_fng_drools

This repository contains a Java and Spring Boot-based business rules system developed for the class Administracion del conocimiento and is based on a case of credits and loans institution. The system leverages the power of Drools, a rules engine, to enforce various business rules related to actions, file formats, and data validation within the context of credit quota openings and other relevant operations.

## How to Run the Project
To run the project locally, follow these steps:

**Clone the Repository**: Clone this repository to your local machine using the following command:

```
git clone https://github.com/your-username/fng-drools-business-rules.git
```

**Build the Project**: Navigate to the project directory and build the project using Maven:
```
cd fng-drools-business-rules
mvn clean install
```

**Run the Application**: Run the Spring Boot application using the following Maven command:
```
mvn spring-boot:run
```

**Access the Application**: Once the application is running, you can access it at `http://localhost:8080` in your web browser.

## Description
The system consists of a set of Drools rules that govern various actions and validations related to credit quota openings and other operations. These rules are defined in DRL (Drools Rule Language) files and are executed by the Drools rules engine.

## Rules Overview
The system includes several Drools rules covering different scenarios:

- Permissions: Rules to check whether a user has permissions to perform specific actions.
- File Format: Rules to validate the format and content of uploaded files.
- Data Validation: Rules to validate the data provided for credit quota openings, including checks for NIT numbers, debtor IDs, municipality codes, CIIU codes, credit references, and warranty codes.
- Action Authorization: Rules to authorize or deny mass cancellation of reservations.

