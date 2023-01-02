# UITestAutomationDemo
UITestAutomationDemo
pre-requsite ;
1. OS : windows
2. eclipse version used: IDE (Eclipse IDE for Enterprise Java Developers.- Version: 2018-12 (4.10.0) Build id: 20181214-0600
3. cucumber installed in eclipse. 
4. maven 3 or later
5. Java SDK 8
6. other generic softwares.
7. The following items should be installed in your system:
Maven 3.
git command line.
Execute the below mention command to run the application on local environment:
1.	git clone https://github.com/spring-projects/spring-petclinic.git
2.	cd spring-petclinic
3.	./mvnw spring-boot:run
After this you can access the application on: http://localhost:8080/


Bring a GitHub hosted Maven project into Eclipse, follow these steps:
1. Copy the GitHub URL of the repository to the clipboard [Refer the email body]
2. Open Eclipse and choose Import –> Projects from Git (with smart import)
3. Choose the Clone URI option in the Git import wizard and click Next
4. Confirm the URI, Host and Repository path parameters and click Next
5. Choose the Git branches to clone from the remote repository and click Next
6. Confirm the Directory into which the repository will be cloned and click Next
7. Choose the Maven project to import into Eclipse from GitHub and click Finish


Execute the project from Eclipse ;
1. Open the project 
2. Run maven clean from runner/project/testng.xml
3. Run maven install/test from runner/project/testng.xml
4. let the steps to be execute/
5. Refer the /target/DetailedCucumberReports/index.html folder for detailed report with screenshots [Only UI Test]
6. Refer other reports : CucumberTestReport.json , surefire-reports  or testNG reports for more details.
