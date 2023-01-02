package com.TestAutomationDemo.page;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Veterinarianspage {

	public List<LinkedHashMap<String, String>> Gettabledata(WebDriver driver) throws InterruptedException {
		boolean nextpage;
		// Let's get header first
		String headerLoc = "(.//table[@class='table table-striped']//tr)[1]/th";
		List<WebElement> allHeadersEle = driver.findElements(By.xpath(headerLoc));
		List<String> allHeaderNames = new ArrayList<String>();
		for (WebElement header : allHeadersEle) {
			String headerName = header.getText();
			allHeaderNames.add(headerName);
		}
		// Each row will be a key value pair. So we will use LinkedHashMap so that order
		// can be retained.
		// All map will be added to a list.
		List<LinkedHashMap<String, String>> allTableData = new ArrayList<LinkedHashMap<String, String>>();
		boolean flag = true;
		while (flag) {
			// Get total rows count
			String rowLoc = ".//table[@class='table table-striped']//tbody/tr";
			List<WebElement> allRowsEle = driver.findElements(By.xpath(rowLoc));
			for (int i = 1; i <= allRowsEle.size(); i++) {
				// Getting specific row with each iteration
				String specificRowLoc = ".//table[@class='table table-striped']//tbody/tr[" + i + "]";
				// Locating only cells of specific row.
				List<WebElement> allColumnsEle = driver.findElement(By.xpath(specificRowLoc))
						.findElements(By.tagName("td"));
				// Creating a map to store key-value pair data. It will be created for each
				// iteration of row
				LinkedHashMap<String, String> eachRowData = new LinkedHashMap<>();
				// Iterating each cell
				for (int j = 0; j < allColumnsEle.size(); j++) {
					// Getting cell value
					String cellValue = allColumnsEle.get(j).getText();
					// We will put in to map with header name and value with iteration
					// Get jth index value from allHeaderNames and jth cell value of row
					eachRowData.put(allHeaderNames.get(j), cellValue);
				}
				// After iterating row completely, add in to list.
				allTableData.add(eachRowData);

			}
			WebElement parent = driver.findElement(By.xpath("(.//div/span)[8]"));
//			boolean ChildLink = parent.findElements(By.xpath(".//span/a[@title='Next']")).size() > 0;
			boolean NoNextpage = parent.findElements(By.xpath(".//span[@title='Next']")).size() > 0;

			if (NoNextpage == true) {
				flag = false;
				break;
			} else {
				// Before clicking Checking current page
				int currentPage = Integer
						.parseInt(driver.findElement(By.xpath(".//div//span/span[.='1']")).getText().trim());
				System.out.println("We are at page " + currentPage + " now.");
				WebElement nextpageelement = driver.findElement(By.xpath(".//span/a[(@title='Next')]"));
				nextpageelement.click();
			}
		}
		return allTableData;
	}
}