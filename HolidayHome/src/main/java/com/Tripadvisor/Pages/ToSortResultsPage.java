package com.Tripadvisor.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.Tripadvisor.Bases.TestBase;

public class ToSortResultsPage extends TestBase {
	By tripAdvisorSort=By.xpath("//*[@id=\"component_2\"]/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div");
	By customerRating=By.xpath("//*[@id=\"component_2\"]/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[4]/div/span");
	
	By showMoreLoc=By.xpath("//*[@id=\"component_2\"]/div/div[3]/div/div[1]/div[1]/div[1]/div/div/div[7]/div[2]/div[5]");
    By amenitiesLoc=By.xpath("//div[text()='Amenities']");
    By elevator=By.xpath("//div[contains(text(),'Elevator/Lift access')]");
	
    public void sortByRating() throws InterruptedException{
 			Thread.sleep(2000);
 			driver.findElement(tripAdvisorSort).click();
 			Thread.sleep(2000);
 			driver.findElement(customerRating).click();
 			Thread.sleep(2000);
    }
    public void sortByAmenities() throws InterruptedException {
		
		
	    WebElement scr=driver.findElement(amenitiesLoc);
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scr);
	    driver.findElement(showMoreLoc).click();
	    
	    driver.findElement(elevator).click();
	    
	}
    
		
	    
	 
	
}
