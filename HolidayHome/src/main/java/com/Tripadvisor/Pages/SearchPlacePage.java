package com.Tripadvisor.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Tripadvisor.Bases.TestBase;

public class SearchPlacePage extends TestBase {

	By searchBoxLoc = By.xpath("/html/body/div[3]/div/form/input[1]");
	By dropDownPlaceLoc=By.xpath("//*[@id='typeahead_results']/a[1]");
	By hotelRentalsHeadingLoc=By.xpath("//*[@id='HEADING']/h1");
	
	public String searchForPlace(String placeName) throws InterruptedException {
		WebElement search = driver.findElement(searchBoxLoc);
		search.sendKeys(placeName);
		Thread.sleep(4000);
		driver.findElement(dropDownPlaceLoc).click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(hotelRentalsHeadingLoc));
		String pageTitle=driver.getTitle();
		
		return pageTitle;
	}
}
