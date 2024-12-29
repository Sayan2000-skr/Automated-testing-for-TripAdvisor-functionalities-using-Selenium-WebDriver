package com.Tripadvisor.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Tripadvisor.Bases.TestBase;

public class ScreenShotPage extends TestBase{
	/* To capture the displayed screen*/
	public void screenshot(String fileName) throws IOException{
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
	
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss"); // yyyy-MM-dd
		String dateTime = sdf.format(date);
//		fileName = "screenshot_" + dateTime;
	
		File destFile = new File(".\\src\\test\\resources\\resources\\Screenshot\\" + fileName + "_" + dateTime + ".png");
		{
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
//	public void screenshot(String ssName) throws IOException {
//        File F= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//        FileUtils.copyFile(F, new File("\\src\\test\\resources\\resources\\Screenshot" + ssName + ".png"));
//	}
}
