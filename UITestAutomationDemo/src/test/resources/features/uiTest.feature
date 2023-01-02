Feature: Frontend Automation using Java/JavaScript/Python Cypress / Selenium 
@ActiveTest 
Scenario: 
	1. Verify image on home page (Pet Image just below the Welcome on Home Page). 
	Given  Open the Browser 
	When Enter the Application URL 
	Then  Verify Homepage image 
@ActiveTest 
Scenario: 
	2. Add a new owner, add pet for that owner and validate the functionality. 
	Given user open application 
	When Add owner details 
	And Add pet details 
	Then  Check all the information added for the newly created owner and pet is correct 
	#@ActiveTest 
	#Scenario:
	#3. Check all the information added for the newly created owner and pet is correct. 
	#	Given user open the browser and application URL 
	#	When loadpage 
	#	Then  closebrowser 
@ActiveTest 
Scenario: 
	4.	Find all the Veterinarians which are added in the application and store them in list with print. 
	Given user open application 
	When User click on Veterinarians 
	Then  user should be able to store and print Veterinarians 
	#@inActiveTest 
	#Scenario:
	#5.	Find all the existing owners which are added in application and store them in list with print. 
	#	Given enterurl 
	#	When loadpage 
	#	Then  closebrowser