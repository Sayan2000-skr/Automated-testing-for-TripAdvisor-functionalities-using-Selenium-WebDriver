package com.Tripadvisor.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;

import com.Tripadvisor.Bases.TestBase;


public class CruisesHomePage extends TestBase {
	By cruiseLineLoc=By.xpath("//*[@id=\"component_1\"]/div/div[2]/div/div[1]/div");
	By selectLineLoc=By.xpath("//*[@id=\"menu-item-17735501\"]/div/span");
	By cruiseShipLoc=By.xpath("//*[@id=\"component_1\"]/div/div[2]/div/div[2]/div/button");
	By selectShipLoc=By.xpath("//*[@id=\"menu-item-17735460\"]/div/span");
	By searchButtonLoc=By.xpath("//*[@id=\"component_1\"]/div/div[2]/div/div[3]/span/button");
	public void toSelectCruiseLine() throws InterruptedException {
	
		driver.findElement(cruiseLineLoc).click();
		Thread.sleep(2000);
		driver.findElement(selectLineLoc).click();
		Thread.sleep(2000);
		
	}
	public void toSelectCruiseShip() throws InterruptedException, IOException {
		
		driver.findElement(cruiseShipLoc).click();
		Thread.sleep(2000);
		driver.findElement(selectShipLoc).click();
		Thread.sleep(2000);
		ScreenShotPage sp =new ScreenShotPage();
		 sp.screenshot("CriusesHome");
	}
	public void toClickOnSearch() throws InterruptedException  {
		driver.findElement(searchButtonLoc).click();
		Thread.sleep(2000);
		
	}

}
