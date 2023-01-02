package com.TestAutomationDemo.stepdefinitions;

import java.util.LinkedHashMap;
import java.util.List;

import com.TestAutomationDemo.helper.WaitHelper;
import com.TestAutomationDemo.page.Homepage;
import com.TestAutomationDemo.page.Veterinarianspage;
import com.TestAutomationDemo.testBase.TestBase;
import com.TestAutomationDemo.utils.library;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UI_Scenario4_VerifyVeterinarians extends TestBase {
	WaitHelper waitHelper = new WaitHelper(driver);
	Homepage hp = new Homepage();
	Veterinarianspage vp = new Veterinarianspage();
	private String URL = library.getProperty("URL");

	@Given("user open the browser and application URL")
	public void openAppBrowser() {
		try {
			openBrowser();
			driver.get(URL);
		} catch (Exception e) {
		}
	}

	@When("User click on Veterinarians")
	public void clickonfindownerLink() {
		try {
			hp.ClickVeterinariansLNK(driver);
		} catch (Exception e) {
		}
	}

	@Then("user should be able to store and print Veterinarians")
	public void Verify_Details() {
		try {
			List<LinkedHashMap<String, String>> tabledata = vp.Gettabledata(driver);
			System.out.println(tabledata);
		} catch (Exception e) {
		}
	}
}
