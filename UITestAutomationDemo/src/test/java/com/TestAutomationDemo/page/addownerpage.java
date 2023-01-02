package com.TestAutomationDemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addownerpage {

	private By fname= By.xpath(".//input[@name='firstName']");

	public void enterfname(WebDriver driver, String firstname) {
		try {
			driver.findElement(fname).sendKeys(firstname);
		} catch (Exception e) {

		}
	}
	private By lName= By.xpath(".//input[@name='lastName']");

	public void enterlastName(WebDriver driver, String lastName) {
		try {
			driver.findElement(lName).sendKeys(lastName);
		} catch (Exception e) {

		}
	}
	private By address= By.xpath(".//input[@name='address']");

	public void enteraddress(WebDriver driver, String Address) {
		try {
			driver.findElement(address).sendKeys(Address);
		} catch (Exception e) {

		}
	}
	private By city= By.xpath(".//input[@name='city']");

	public void entercity(WebDriver driver, String City) {
		try {
			driver.findElement(city).sendKeys(City);
		} catch (Exception e) {

		}
	}
	private By telephone= By.xpath(".//input[@name='telephone']");

	public void Addtelephone(WebDriver driver, String telephon) {
		try {
			driver.findElement(telephone).sendKeys(telephon);
		} catch (Exception e) {

		}
	}
	
	private By addownerBTN= By.xpath(".//button[.='Add Owner']");

	public void clickONaddownerBTN(WebDriver driver) {
		try {
			driver.findElement(addownerBTN).click();;
		} catch (Exception e) {

		}
	}
}
