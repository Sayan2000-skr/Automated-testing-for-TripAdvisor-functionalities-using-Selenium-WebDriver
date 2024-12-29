package com.Tripadvisor.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;

import com.Tripadvisor.Bases.TestBase;

@SuppressWarnings("unused")
public class HolidayRentalsResultPage extends TestBase {
	private static final String scanner = null;

	public void todisplayResult(){
		
		WebElement element = driver.findElement(By.tagName("header"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element); 
		List<WebElement> hotelName=driver.findElements(By.xpath("//h2[contains(@class , 'fLhRg')]/a"));
		List<WebElement> pricePerDay=driver.findElements(By.xpath("//*[@class=\"HUpIi b\"]"));
		List<WebElement> priceForFiveDays=driver.findElements(By.xpath("//*[@class=\"ciZLE\"]"));
		
		for(int i=0;i<5;i++)
		{
			System.out.println((i+1)+") HotelName:"+" "+hotelName.get(i).getText());
			System.out.println("Price per day:"+" "+pricePerDay.get(i).getText());
			System.out.println("Price for 5 days:"+" "+priceForFiveDays.get(i).getText());
			System.out.println();
			
		}
		
		
		  

	}

}
