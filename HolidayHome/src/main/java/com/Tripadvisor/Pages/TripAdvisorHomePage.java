package com.Tripadvisor.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.Tripadvisor.Bases.TestBase;

public class TripAdvisorHomePage extends TestBase {

	By holidaysHomeLoc = By.xpath("//*[@id='lithium-root']/main/div[1]/div[2]/div/div/div[2]/a/span[1]/span");
	By cruiseLoc=By.xpath("//*[@id=\"component_1\"]/nav/div/div/div[1]/a[9]/span");
	
	public void toSelectHolidayHomes() throws InterruptedException {

		driver.findElement(holidaysHomeLoc).click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/form/input[1]")));

	}
	public void toSearchCruises() {
		
		driver.findElement(cruiseLoc).click();
		
	}
}
