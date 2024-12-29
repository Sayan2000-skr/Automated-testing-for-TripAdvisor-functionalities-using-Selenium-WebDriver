package com.Tripadvisor.Pages;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//import java.text.DateFormat;
//import java.text.Format;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.Tripadvisor.Bases.TestBase;



public class SetDatePage extends TestBase {
		By checkInLoc=By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div");
//		By checkInDateLoc=By.xpath("//div[text()='9']");
//		By checkOutDateLoc=By.xpath("//div[text()='14']");
		  
		public void setCheckInDates() throws InterruptedException {
			
			  String s;
			  Date date;
			  Format formatter;
			  Calendar calendar = Calendar.getInstance();
			 
			/***********************************To Get Tomorrows Date*************************************/		  
			  calendar.add(Calendar.DATE, 1);
			  date = calendar.getTime();
			  formatter = new SimpleDateFormat("d");
			  s = formatter.format(date);
			  System.out.println("Tomorrow : " + s);
			  
			By checkInDateLoc=By.xpath("//div[text()=\""+s+"\"]"); 
			driver.findElement(checkInLoc).click();
			Thread.sleep(2000);
			driver.findElement(checkInDateLoc).click();
			Thread.sleep(2000);
			
		}
		public void setCheckOutDates() throws InterruptedException {
//			driver.findElement(checkOutLoc).click();
//			Thread.sleep(2000);
			  String s;
			  Date date;
			  Format formatter;
			  Calendar calendar = Calendar.getInstance();
			/***********************************To Get 5th days Date*************************************/
			  calendar.add(Calendar.DATE, 6);
			  date = calendar.getTime();
			  formatter = new SimpleDateFormat("d");
			  s = formatter.format(date);
			  System.out.println("5 th day from tomorrow : " + s);
			
			By checkOutDateLoc=By.xpath("//div[text()='"+s+"']"); 
			driver.findElement(checkOutDateLoc).click();
			Thread.sleep(2000);
			
		}

}

