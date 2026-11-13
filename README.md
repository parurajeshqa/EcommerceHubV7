EcommerceHubV7 – Hybrid Automation Framework
<p align="center">
<strong>A Scalable, Maintainable & Data-Driven Test Automation Framework for E-Commerce Applications</strong>
</p>

<p align="center">
<img src="https://img.shields.io/badge/Java-Automation-orange?logo=openjdk" />
<img src="https://img.shields.io/badge/Selenium-4.51.0-green?logo=selenium" />
<img src="https://img.shields.io/badge/TestNG-7.12.0-red" />
<img src="https://img.shields.io/badge/Maven-Build-blue?logo=apachemaven" />
<img src="https://img.shields.io/badge/ExtentReports-5.1.2-purple" />
<img src="https://img.shields.io/badge/Framework-Hybrid-brightgreen" />
</p>

<p align="center">
<a href="https://github.com/parurajeshqa/EcommerceHubV7">Repository</a> •
<a href="https://github.com/parurajeshqa/EcommerceHubV7/tree/main/src">Source Code</a> •
<a href="https://github.com/parurajeshqa/EcommerceHubV7/tree/main/reports">Test Reports</a>
</p>

📌 Project Overview
EcommerceHubV7 is a Java-based Hybrid Test Automation Framework developed to automate end-to-end functional testing of an e-commerce web application.

The framework combines structured automation practices, reusable components, Page Object Model (POM), TestNG execution management, and data-driven testing capabilities to improve test maintainability, scalability, and execution efficiency.

Built using Selenium WebDriver, Java, TestNG, and Maven, the framework supports automated execution across multiple browsers, centralized logging, retry mechanisms, and detailed HTML test reporting.

The primary objective is to establish a reliable and reusable automation solution that simplifies regression testing and improves overall application quality.

🎯 Key Features
Hybrid Framework Architecture – Combines reusable automation components, Page Object Model, and data-driven testing.
Page Object Model (POM) – Separates page locators and page interactions from test logic.
Cross-Browser Testing – Supports Chrome, Edge, and Firefox execution through TestNG configuration.
Data-Driven Testing – Supports external test data using Apache POI and Excel-based data handling.
TestNG Integration – Provides test grouping, execution configuration, listeners, and suite management.
Parallel Execution Configuration – Supports parallel test execution through TestNG.
Automatic Retry Mechanism – Implements RetryAnalyzer for retrying failed test executions.
Extent HTML Reporting – Generates detailed execution reports using ExtentReports.
Centralized Logging – Uses Log4j2 for structured execution logs.
Screenshot Management – Maintains screenshots for test execution and failure analysis.
Maven Build Management – Manages dependencies and test execution through Maven.
Modular Design – Promotes reusable methods, maintainable test scripts, and separation of responsibilities.
🧰 Technology Stack

Technology	Purpose
Java	Programming language
Selenium WebDriver 4.51.0	Browser automation
TestNG 7.12.0	Test execution and management
Maven	Build and dependency management
ExtentReports 5.1.2	HTML test reporting
Apache POI 6.0.0	Excel-based test data handling
Log4j2 2.26.1	Logging and debugging
Commons Email 1.6.0	Email functionality
Chrome	Browser testing
Microsoft Edge	Browser testing
Mozilla Firefox	Browser testing
🏗️ Framework Architecture
The framework follows a layered approach to separate test execution, browser management, page interactions, test data, and reporting responsibilities.

High-Level Architecture

text
                  TEST EXECUTION
                        |
                   TestNG Suite
                    testng.xml
                        |
                  Test Classes
                        |
                 Base Test Class
                  /          \
          Driver Setup     Utilities
               |               |
               |        Logging / Retry
               |        Reporting
               |
          Page Object Model
               |
          Selenium WebDriver
               |
          E-Commerce Web App
               |
        Execution Results
               |
       Extent HTML Reports
       Logs / Screenshots
Project Structure

text
EcommerceHubV7/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pageObjects/
│   │       ├── testBase/
│   │       └── utilities/
│   │
│   └── test/
│       └── java/
│           └── testCases/
│
├── testData/
│   └── Excel / External Test Data
│
├── reports/
│   └── HTML Execution Reports
│
├── screenshots/
│   └── Test Execution Screenshots
│
├── logs/
│   └── Execution Logs
│
├── test-output/
│   └── TestNG Execution Results
│
├── pom.xml
├── testng.xml
└── README.md
Note: The structure above represents the framework's logical organization. Refer to the actual source folders for exact package and file locations.

🧪 Automated Test Scenarios
The framework currently includes automation coverage for the following e-commerce workflows:


Test ID	Test Scenario	Test Coverage
TC01	Launch Application	Application launch and title verification
TC02	User Login	Login functionality
TC02	Data-Driven Login	Login with external test data
TC03	Add to Cart	Product cart functionality
TC04	Complete Purchase	End-to-end purchase workflow
TC05	Add to Wishlist	Wishlist functionality
TC06	Add Affiliate	Affiliate functionality
Test Grouping
TestNG groups are used to organize test execution.

Sanity: Basic application validation.
Regression: Broader functional regression coverage.
Data-Driven: Data-driven test execution.
🌐 Cross-Browser Testing
The framework is configured to execute automated test scenarios on multiple browsers.


Browser	Execution Support
Google Chrome	Yes
Microsoft Edge	Yes
Mozilla Firefox	Yes
Browser execution is configured through testng.xml, allowing browser-specific test configurations.

The current suite also defines parallel execution with a thread count of 5.

📊 Test Reporting
The framework integrates ExtentReports 5.1.2 to generate detailed HTML execution reports.

Reports provide visibility into test execution results and help identify failures during regression testing.

Reporting capabilities include:

Test execution status.
Passed, failed, and skipped test results.
Execution details and test logs.
Failure analysis.
Historical report artifacts maintained in the repository.
Report Location:


text
reports/
Execution Logs:


text
logs/
Screenshots:


text
screenshots/
Open the generated HTML report in a browser to review the execution results.

⚙️ Prerequisites
Before executing the framework, ensure the following tools are installed:

Java JDK 11 or compatible version.
Apache Maven.
Eclipse IDE or IntelliJ IDEA (optional).
Google Chrome, Microsoft Edge, or Mozilla Firefox.
Git.
Verify your Java and Maven installations:


bash
java -version
mvn -version
🚀 Getting Started
1. Clone the Repository

bash
git clone https://github.com/parurajeshqa/EcommerceHubV7.git
2. Navigate to the Project

bash
cd EcommerceHubV7
3. Import the Project
Import the project into Eclipse or IntelliJ IDEA as an existing Maven project.

4. Resolve Maven Dependencies

bash
mvn clean install
5. Configure Test Execution
Open:


text
testng.xml
Configure the desired browser and operating system parameters according to your execution environment.

The current configuration includes Chrome, Edge, and Firefox test entries.

6. Execute the Automation Suite
Run the complete configured TestNG suite using:


bash
mvn clean test
Alternatively, execute the suite directly through TestNG using testng.xml in your IDE.

7. Review Execution Results
After execution, review the generated artifacts in:


text
reports/
screenshots/
logs/
test-output/
🔄 Test Execution Workflow
TestNG initializes the configured test suite.
The BaseClass manages browser initialization and test setup.
Selenium WebDriver launches the selected browser.
Page Object classes interact with the application.
Test classes execute the required business scenarios.
TestNG manages execution, grouping, and retry handling.
Log4j2 captures execution logs.
ExtentReports records test execution results.
Screenshots and logs support debugging and failure analysis.
💡 Framework Design Principles
This project follows several important automation engineering principles:

Reusability – Common methods and utilities reduce code duplication.
Maintainability – Page Object Model separates UI interactions from test logic.
Scalability – Modular packages make it easier to extend test coverage.
Reliability – Retry handling and structured logging assist with failure analysis.
Flexibility – TestNG configuration enables different browser execution setups.
Data Separation – External test data supports reusable test scenarios.
📸 Project Artifacts
Explore the following repository directories:


Directory	Description
reports/	HTML execution reports
screenshots/	Captured test screenshots
logs/	Execution log files
testData/	Test data resources
test-output/	TestNG execution output
🚧 Future Enhancements
Potential enhancements for the framework include:

CI/CD integration using Jenkins or GitHub Actions.
Docker-based browser execution.
Selenium Grid integration.
Enhanced failure screenshot automation.
Environment-specific configuration management.
API testing integration.
Enhanced reporting and email notifications.
Additional negative and boundary test scenarios.
👨‍💻 Author
Rajesh Paru

QA Automation Engineer | Selenium | Java | TestNG | Maven | Hybrid Automation Frameworks

GitHub: @parurajeshqa

Project: EcommerceHubV7

⭐ Support
If you find this project useful, consider giving the repository a ⭐ on GitHub.

Your feedback, suggestions, and contributions are always welcome!

<p align="center">
<strong>Quality is never an accident. It is always the result of intelligent effort.</strong>
</p>

<p align="center">
Built with ❤️ for Quality Engineering and Test Automation.
</p>
