package com.Tripadvisor.Bases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public Properties prop;
	File file;
	FileInputStream fis;

	public void setupDriver() {
		prop = new Properties();
		
		try {
			fis = new FileInputStream(".\\src\\main\\resources\\com\\Tripadvisor\\config\\Config.properties");
			prop.load(fis);
		} catch (FileNotFoundException fnf) {
			System.out.println("File name or path name is not correct");
		} catch (IOException ioe) {
			System.out.println("Input output error");
		}

		if (prop.getProperty("Browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (prop.getProperty("Browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void navigateToURL() {

		driver.get(prop.getProperty("URL"));

	}
	
	public void closeDriver() {
		driver.quit();
	}
}
