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

#### Install lombok in IntelliJ
voltar depois

#### Directory
You need to open your IDE (IntelliJ in the example used above) and import `confidentiality-integrity` as a Maven project. Then, in `confidentiality-integrity\src\main\resources\application.properties`, you need to define the information about your Postgres administrator user by changing the following properties: <br>
spring.datasource.url= `jdbc:postgresql://localhost:5432/database` <br>
spring.datasource.username= `username`<br>
spring.datasource.password= `password`

Finally, execute the main class `ConfidentialityIntegrity.class` as a Java Application.

### Tests Execution Steps
In the directory `confidentiality-integrity/src/test/resources/features/`, you will find the features that are used for conducting tests. The features describe the expected behavior of the software in natural language. As an example:


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

#### Plugins
For the tests to work, it is necessary to install the Scala plugin in your IDE. To do this, go to Settings > Plugins (IntelliJ) and search for the Scala plugin.

#### Directory
You need to open your IDE (IntelliJ in the example used above) and import `availability` as a Maven project.

### Tests Execution Steps
To run the availability test, first ensure that the application is running. Then, execute the command:
`mvn clean test-compile gatling:test`
