package com.TestAutomationDemo.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ownerinfopage {

	
	private By addNewpetBTN= By.xpath("(.//a[@class='btn btn-primary'])[2]");

	public void clickaddNewpetBTN(WebDriver driver) {
		try {
			driver.findElement(addNewpetBTN).click();;
		} catch (Exception e) {

		}
	}
	private By ownername= By.xpath("(.//tr/td)[1]/b");

	public void Verifyownername(WebDriver driver, String actualOwnername) {
		try {
			String expected_ownername = driver.findElement(ownername).getText();
			assertEquals(actualOwnername, expected_ownername,"Owner details are wrong");
		} catch (Exception e) {

		}
	}
}
