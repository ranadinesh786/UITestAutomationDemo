package com.TestAutomationDemo.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.TestAutomationDemo.helper.LoggerHelper;
import com.TestAutomationDemo.testBase.TestBase;

public class library extends TestBase{

	final static Logger log = LoggerHelper.getLogger(library.class);
	public static Properties prop = new Properties();

	public static String getProperty(String key) {
		String value = "nullvalue";
		String CONFIG_PATH = "./src/test/resources/properties/configuration.properties";
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(CONFIG_PATH));
			value = p.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	public static BufferedImage takeScreenShot(WebDriver browser) throws IOException {
	    byte[] screenShotData = ((TakesScreenshot) browser).getScreenshotAs(OutputType.BYTES);
	    BufferedImage screenShot = null;
	    screenShot = ImageIO.read(new ByteArrayInputStream(screenShotData));
	    return screenShot;
//	    FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
	    //pulled from http://stackoverflow.com/questions/3422262/take-a-screenshot-with-selenium-webdriver
	    //byte image addition pulled from : http://stackoverflow.com/questions/13832322/how-to-capture-the-screenshot-of-only-a-specific-element-using-selenium-webdrive
	}
}
