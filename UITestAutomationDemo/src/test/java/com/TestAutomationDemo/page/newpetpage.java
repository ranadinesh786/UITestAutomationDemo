package com.TestAutomationDemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class newpetpage {

	private By nameTB = By.xpath(".//input[@name='name']");

	public void enternameTB(WebDriver driver, String petname) {
		try {
			driver.findElement(nameTB).sendKeys(petname);
			;
			;
		} catch (Exception e) {

		}
	}

	private By birthDateTB = By.xpath(".//input[@name='birthDate']");

	public void AddbirthDateTB(WebDriver driver, String birthDate) {
		try {
			driver.findElement(birthDateTB).sendKeys(birthDate);
			;
			;
		} catch (Exception e) {

		}
	}

	private By selectTypeDDL = By.xpath(".//select[@name='type']");

	public void selectType(WebDriver driver, String birthDate) {
		try {
			Select drpCountry = new Select(driver.findElement(selectTypeDDL));
			drpCountry.deselectByIndex(1);
		} catch (Exception e) {

		}
	}

	private By AddPetBTN = By.xpath(".//button[.='Add Pet']");

	public void clickAddPetBTN(WebDriver driver) {
		try {
			driver.findElement(AddPetBTN).click();
		} catch (Exception e) {

		}
	}
}
