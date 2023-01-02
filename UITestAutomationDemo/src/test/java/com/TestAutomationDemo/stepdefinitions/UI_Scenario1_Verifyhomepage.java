package com.TestAutomationDemo.stepdefinitions;

import static org.testng.Assert.assertEquals;

import com.TestAutomationDemo.helper.WaitHelper;
import com.TestAutomationDemo.page.Homepage;
import com.TestAutomationDemo.testBase.TestBase;
import com.TestAutomationDemo.utils.library;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UI_Scenario1_Verifyhomepage extends TestBase {
	WaitHelper waitHelper = new WaitHelper(driver);
	String URL = library.getProperty("URL");
	Homepage hp = new Homepage();
	boolean hpresp;

	@Given("Open the Browser")
	public void openAppBrowser() {
		try {
			openBrowser();
		} catch (Exception e) {
		}
	}

	@When("Enter the Application URL")
	public void enterURL() {
		try {
			driver.get(URL);
		} catch (Exception e) {
		}
	}

	@Then("Verify Homepage image")
	public void Verify_Homepage_image() {
		try {
			boolean hpresp = hp.verifyhp(driver);
			System.out.println(hpresp);
			assertEquals(hpresp, true);
		} catch (Exception e) {
		}
	}
}
