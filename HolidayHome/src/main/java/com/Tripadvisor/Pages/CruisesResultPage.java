package com.Tripadvisor.Pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.Tripadvisor.Bases.TestBase;

public class CruisesResultPage extends TestBase{
	By overviewLoc=By.xpath("//*[@id=\"ship_overview\"]/div/div/h2");
	By reviewsLoc=By.xpath("//*[@id=\"ship_reviews\"]/div/div[1]/div/h2");
	public void toDisplayCruisesResults() throws InterruptedException, IOException {
		
        @SuppressWarnings("unused")
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window = " + driver.getTitle());
		Set<String> s1 = driver.getWindowHandles();  
		for(String window : s1)
		{
			driver.switchTo().window(window).getTitle();
			System.out.println(driver.switchTo().window(window).getTitle() + " --> " + window);
//			Thread.sleep(3000);
			
		}
		ScreenShotPage sp =new ScreenShotPage();
		sp.screenshot("CruisesResult");
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollIntoView()", driver
				.findElement(overviewLoc));
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"ship_overview\"]/div/div/div/div[1]/div[1]/div[2]")).getText());
		jse.executeScript("window.scrollBy(0,350)");
		Thread.sleep(0200);
		jse.executeScript("arguments[0].scrollIntoView()", driver
				.findElement(reviewsLoc));
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"ship_reviews\"]/div/div[2]/div/div[1]/div[1]/div[3]/ul")).getText());
		driver.close();
		
	}
}
