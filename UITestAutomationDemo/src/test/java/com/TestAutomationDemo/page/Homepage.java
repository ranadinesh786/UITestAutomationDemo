package com.TestAutomationDemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	boolean imagexist = false;
	private By HpImage = By.xpath(".//img[@class='img-responsive']");

	public boolean verifyhp(WebDriver driver) {
		try {
			imagexist = driver.findElement(HpImage).isDisplayed();
		} catch (Exception e) {

		}
		return imagexist;
	}

	private By findownerLNK = By.xpath(".//span[.='Find owners']");

	public void clickonfindownerLNK(WebDriver driver) {
		try {
			driver.findElement(findownerLNK).click();
		} catch (Exception e) {

		}
	}
	private By addOwnerbtn = By.xpath(".//a[.='Add Owner']");

	public void clickonaddOwnerbtn(WebDriver driver) {
		try {
			driver.findElement(addOwnerbtn).click();
		} catch (Exception e) {

		}
	}
	
	private By VeterinariansLNK = By.xpath(".//span[.='Veterinarians']");

	public boolean ClickVeterinariansLNK(WebDriver driver) {
		try {
			driver.findElement(VeterinariansLNK).click();
		} catch (Exception e) {

		}
		return imagexist;
	}
	

}
