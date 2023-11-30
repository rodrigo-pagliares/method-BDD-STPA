# A method based on Behavior Driven Development (BDD) and System-Theoretic Process Analysis (STPA) for verifying security requirements in critical software systems
This Computer Science final paper aims to apply the method based on BDD and STPA for the verification of security requirements. 
The application was developed using Thymeleaf for the front-end, SpringBoot for the back-end, and PostgreSQL for the database. Tests for Confidentiality and Integrity were conducted using the Cucumber, JUnit, and Selenium frameworks. For availability testing, the Karate and Gatling frameworks were utilized.

## Confidentiality and Integrity

### Requirements
- Java 17+
- Google Chrome 119
- Chrome Driver 119
- PostgreSQL 14+
- Lombok

### Links (optional)
- Java 17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
- PostgreSQL: https://www.postgresql.org/download/
- Lombok: https://projectlombok.org/download
- IntelliJ: https://www.jetbrains.com/pt-br/idea/download/?section=windows

### Execution steps
To run the application and tests, you need to follow the steps below:

#### Set Environment Variable
Need to have in Windowns enviroment Variables the folder path of intelliJ.

#### Install Lombok plugin in IntelliJ
To run the application, it is necessary to have Lombok installed in the IDE. To do this, go to Settings > Plugins (in IntelliJ), search for the Lombok Plugin, and then click on 'Install Plugin'.

#### Directory
You need to open your IDE (IntelliJ in the example used above) and import `confidentiality-integrity` as a Maven project. Then, in `confidentiality-integrity\src\main\resources\application.properties`, you need to define the information about your Postgres administrator user by changing the following properties: <br>
spring.datasource.url= `jdbc:postgresql://localhost:0000/database` <br>
spring.datasource.username= `username`<br>
spring.datasource.password= `password`

Finally, execute the main class `ConfidentialityIntegrity.class` as a Java Application.

### Tests Execution Steps
In the directory `confidentiality-integrity/src/test/resources/features/`, you will find the features that are used for conducting tests. The features describe the expected behavior of the software in natural language. As an example:

![feature](https://drive.google.com/uc?export=view&id=1mYrs21RgV0bcRI0sgBo-vSzeCLGUyx24)

And in the directory `confidentiality-integrity\src\test\java\com\rubatino\tcc`, you will find the implementation of the features. To run the tests, simply right-click on the `RunCucumberTest.class` class and click on " Run 'RunCucumberTest' ".

**Note: For the execution of Selenium, Google Chrome 119 was used. The `chromedriver.exe` file is located in `confidentiality-integrity/src/test/resources/`.**

## Availability

### Requirements
- Java 17+

### Links (optional)
- Java 17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

### Execution steps
To run the application and tests, you need to follow the steps below:

#### Set Environment Variable
Need to have in Windowns enviroment Variables the folder path of intelliJ.

#### Install Scala plugin in IntelliJ
For the tests to work, it is necessary to install the Scala plugin in your IDE. To do this, go to Settings > Plugins (IntelliJ),search for Scala plugin and then click on 'Install Plugin'.

#### Directory
You need to open your IDE (IntelliJ in the example used above) and import `availability` as a Maven project.

### Tests Execution Steps
To run the availability test, first ensure that the application is running. Then, execute the command:
`mvn clean test-compile gatling:test`

## Same images

### Login page:
![login-page](https://drive.google.com/uc?export=view&id=1YpAXOLY3BzHM-PH3jH5Ag5IIwQaktH6M)

### Home page:
![home-page](https://drive.google.com/uc?export=view&id=1NevmDqozv6hrlHk-WeVbnnaEEBlQ_FS6)

### User page:
![user-page](https://drive.google.com/uc?export=view&id=1nN5vaDOTEkAJD-VIZ9r1t0Z_Y3tX3NLF)

### Admin page:
![admin-page](https://drive.google.com/uc?export=view&id=1NWQoFpPZds2yzX8Z7kLIWZJxdWUoKSiR)

### Insufficient privileges Error: 
![error-page](https://drive.google.com/uc?export=view&id=1sGQ3eRTJnF6jC_n3L6FsSrN6OdCcAgA5)

### Confidentiality and Integrity test passed: 
![given-test](https://drive.google.com/uc?export=view&id=1hVszD-D9e8PJMhRi5nhpuYkvECgNJVNH) <br>
![when-test](https://drive.google.com/uc?export=view&id=10Fn5Vw1scgSktNDMbJyf_L3dlxqp1p6_) <br>
![then-test](https://drive.google.com/uc?export=view&id=10mJEyb0WH--45aMeBnxIVd7K0KGi6pFK) <br>
![passed-test](https://drive.google.com/uc?export=view&id=1rieknqRd4h1VqbTKRiQoYEUnvxetLHnL)

### Availability test result:
![availability-test](https://drive.google.com/uc?export=view&id=1C2vUV7P73Gob1XdPvR1XnZjpsVi1tlPw)