package com.TestAutomationDemo.testBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.TestAutomationDemo.helper.Log;
import com.TestAutomationDemo.helper.LoggerHelper;
import com.TestAutomationDemo.helper.WaitHelper;
import com.TestAutomationDemo.utils.library;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public ExtentTest test;
	public Logger log = LoggerHelper.getLogger(this.getClass());
	public WaitHelper waitHelper = new WaitHelper(driver);
	String browser = library.getProperty("browser");

	public WebDriver openBrowser() {
		Log.info("Tests is starting!");
		if (browser.equalsIgnoreCase("CHROME")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			log.info("Invalid Browser Please check browser Name");
		}
		return driver;
	}
}
