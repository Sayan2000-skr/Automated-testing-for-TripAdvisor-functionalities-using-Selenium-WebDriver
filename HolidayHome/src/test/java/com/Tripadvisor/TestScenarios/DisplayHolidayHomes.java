
package com.Tripadvisor.TestScenarios;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Tripadvisor.Bases.TestBase;
import com.Tripadvisor.Pages.HolidayRentalsResultPage;
import com.Tripadvisor.Pages.ScreenShotPage;
import com.Tripadvisor.Pages.SearchPlacePage;
import com.Tripadvisor.Pages.SetDatePage;
import com.Tripadvisor.Pages.ToSetGuestsPage;
import com.Tripadvisor.Pages.ToSortResultsPage;
import com.Tripadvisor.Pages.TripAdvisorHomePage;



public class DisplayHolidayHomes extends TestBase {

	
	public static WebDriver driver;

	
	@BeforeClass
	public void beforeClass() throws  InterruptedException, IOException{
		setupDriver();
		navigateToURL();
		Thread.sleep(4000);
		ScreenShotPage sp =new ScreenShotPage();
		sp.screenshot("Home");
	}

	@Test(priority = 1)
	public void searchingHolidayHomesTest() throws InterruptedException{
		TripAdvisorHomePage clickHolidayHome = new TripAdvisorHomePage();
		clickHolidayHome.toSelectHolidayHomes();
		
	}

	@Test(priority = 2)
	public void searchForPlaceTest() throws Exception  {
		SearchPlacePage placeSearch = new SearchPlacePage();
		String actPageTitle=placeSearch.searchForPlace("Nairobi");
		String expPageTitle="THE 10 BEST Nairobi Houses, Apartments of 2022 | Tripadvisor - Book Villas in Nairobi, Kenya";
		Assert.assertEquals(actPageTitle, expPageTitle);
		
	}
	 @Test (priority=3)
	 public void toSetDatesTest() throws InterruptedException {
		 SetDatePage inAndOutDates=new SetDatePage();
		 inAndOutDates.setCheckInDates();
		 inAndOutDates.setCheckOutDates();
	 }

	 @Test(priority=4)
	 public void toSetGuestsTest() throws InterruptedException{
		 ToSetGuestsPage settingGuests=new ToSetGuestsPage();
		 settingGuests.toSetNoOfGuests() ;
		 

	 }
	 @Test(priority=5)
	 public void sortingResultsTest() throws InterruptedException {
		 ToSortResultsPage sortingResults=new ToSortResultsPage();
		 sortingResults.sortByRating();
		 sortingResults.sortByAmenities();
		
	 }
	 @Test(priority=6)
	 public void displayingHomesResultsTest() throws IOException {
		 HolidayRentalsResultPage displayingResults=new HolidayRentalsResultPage();
		 displayingResults.todisplayResult();
		 ScreenShotPage sp =new ScreenShotPage();
		 sp.screenshot("DisplayResult");
		 
		 
		 
	 }
	 

}
