package com.Tripadvisor.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Tripadvisor.Bases.TestBase;

public class ToSetGuestsPage extends TestBase {
	By guestsDropDownLoc=By.xpath("//*[@id=\"component_2\"]/div/div[2]/div/div/div/div[4]/div/div/div/div[2]");
	
	By guestNoLoc=By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[13]/div/div/div[2]/div/div[2]/div/div[2]/span[2]/span");

	By applyLoc=By.xpath("//div[@class='fqdlM P4']//button[@class='ui_button primary fullwidth']");
	

	public void toSetNoOfGuests() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(guestsDropDownLoc));
		
		 driver.findElement(guestsDropDownLoc).click();
		 
		 driver.findElement(guestNoLoc).click();
		 driver.findElement(guestNoLoc).click();
		
		 driver.findElement(applyLoc).click();
	}


}
