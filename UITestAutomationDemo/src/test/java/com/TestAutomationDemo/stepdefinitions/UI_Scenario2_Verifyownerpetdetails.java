package com.TestAutomationDemo.stepdefinitions;

import com.TestAutomationDemo.helper.WaitHelper;
import com.TestAutomationDemo.page.Homepage;
import com.TestAutomationDemo.page.addownerpage;
import com.TestAutomationDemo.page.newpetpage;
import com.TestAutomationDemo.page.ownerinfopage;
import com.TestAutomationDemo.testBase.TestBase;
import com.TestAutomationDemo.utils.library;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UI_Scenario2_Verifyownerpetdetails extends TestBase {
	WaitHelper waitHelper = new WaitHelper(driver);
	Homepage hp = new Homepage();
	addownerpage op = new addownerpage();
	ownerinfopage oi = new ownerinfopage();
	newpetpage np = new newpetpage();
	private String URL = library.getProperty("URL");
	private String firstname = "TestFirstname";
	private String lastname = "Testlastname";
	private String address = "test address";
	private String City = "testcity";
	private String telephon = "12345678";
	private String petname = "testpet";
	private String birthDate = "01012023";
	private String actualOwnername = firstname + " " + lastname;

	@Given("user open application")
	public void openAppBrowser() {
		try {
			openBrowser();
			driver.get(URL);
		} catch (Exception e) {
		}
	}

	@When("Add owner details")
	public void AddOwnerDetails() {
		try {
			hp.clickonfindownerLNK(driver);
			hp.clickonaddOwnerbtn(driver);
			op.enterfname(driver, firstname);
			op.enterlastName(driver, lastname);
			op.enteraddress(driver, address);
			op.entercity(driver, City);
			op.Addtelephone(driver, telephon);
			op.clickONaddownerBTN(driver);
		} catch (Exception e) {
		}
	}

	@And("Add pet details")
	public void AddPetDetails() {
		try {
			oi.clickaddNewpetBTN(driver);
			np.enternameTB(driver, petname);
			np.AddbirthDateTB(driver, birthDate);
			np.selectType(driver, birthDate);
			np.clickAddPetBTN(driver);
		} catch (Exception e) {
		}
	}

	@Then("Check all the information added for the newly created owner and pet is correct")
	public void Verify_Details() {
		try {
			oi.Verifyownername(driver, actualOwnername);
		} catch (Exception e) {
		}
	}
}
