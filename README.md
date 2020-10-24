## Automation Test Task

Web Test Automation Using Selenium with Cucumber Framework and Page Object Model Design Pattern

## Tools

* Maven
* Cucumber
* Java
* Junit	
* Allure report

## Framework Architecture
	Project-Name
		|-drivers
		|	|_chromedriver
		|	|_geckodriver
		|	|				
		|_src/main/java
		|_src/test/java
		|	|_runner
		|	|	|_TestRunner
		|	|	|...						
		|	|_pages
		|	|	|_HomePage
		|	|	|_WikiPage
		|	|	|_...
		|	|_stepDefinitions
		|	|	|_BaseSteps
		|	|	|_SearchSteps
		|	|	|_Hooks
		|	|_utils
		|	|	|_Screenshot
		|	|	|...
		|_src/test/resources
		|	|_features
		|	|	|_Search.feature
		|_pom.xml								

* pom.xml - manage the dependencies
* **src/test/resources/features** - Store the cucumber .feature files in this directory.
* **src/test/java/runners/** - Implement test runner. With @CucumberOptions, specify the path for the features to execute, glue the step files, and format the plugins for allure reporting.
* **src/test/java/stepDefinitions/** - Write the step definition for each step in the scenarios and put the step definition scripts in this directory. 
* **src/test/java/utils/** - Utility for commonly used function, e.g. take screenshot. 

## Run Tests

  - Run test in Chrome by default
   
        $ mvn test
   
  - Run test in Firefox
   
        $ mvn test -DBrowser=firefox
   
  - Run test in Chrome
   
        $ mvn test -DBrowser=chrome
   
## Reports
After the test run completes, all test results are stored in the directory /target.
Allure results are generated in /target/allure-results.
   
To generate a html report based on "allure-results", use the following cmd in /target directory.

    $ allure generate allure-results --clean -o allure-report
   
This generates a folder allure-report, which includes all the test result artifact. 


* View the summary report below in a browser:

      /target/allure-report/index.html 


* The screenshots taken after each step:

      /target/allure-report/data/attachments/**.png

      
* The test result suites info in csv format:

      /target/allure-report/data/suites.csv 
        


