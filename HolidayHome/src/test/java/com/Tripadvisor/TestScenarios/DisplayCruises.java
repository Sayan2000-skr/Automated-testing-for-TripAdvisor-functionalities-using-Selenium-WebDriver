package com.Tripadvisor.TestScenarios;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Tripadvisor.Bases.TestBase;
import com.Tripadvisor.Pages.CruisesHomePage;
import com.Tripadvisor.Pages.CruisesResultPage;
import com.Tripadvisor.Pages.ScreenShotPage;
import com.Tripadvisor.Pages.SearchPlacePage;
import com.Tripadvisor.Pages.TripAdvisorHomePage;

public class DisplayCruises extends TestBase{


    CruisesHomePage cruisesHome=new CruisesHomePage();
//    @BeforeClass
//	public void beforeClass() throws InterruptedException {
//		setupDriver();
//		navigateToURL();
//		Thread.sleep(4000);
//	}
	 @Test(priority=0)
	 public void searchForCruisesTest() throws InterruptedException {
		 TripAdvisorHomePage searchForCruise=new TripAdvisorHomePage();
//		 searchForCruise.toSelectHolidayHomes();
//		 SearchPlacePage placeSearch = new SearchPlacePage();
//			String actPageTitle=placeSearch.searchForPlace("Nairobi");
		 searchForCruise.toSearchCruises();
		 
	 }
	 @Test(priority=1)
	 public void selectCruiseLineTest() throws InterruptedException {
		 cruisesHome.toSelectCruiseLine();
		
	 }
	 @Test(priority=2)
	 public void selectCruiseShipTest() throws InterruptedException, IOException {
		 cruisesHome.toSelectCruiseShip();
	 }
	 @Test(priority=3)
	 public void clickingSearchTest() throws InterruptedException {
		 cruisesHome.toClickOnSearch();
		 
	 }
	 @Test(priority=4)
	 public void  displayingCruiseResultTest() throws InterruptedException, IOException{
		 CruisesResultPage displayResult=new CruisesResultPage();
		 displayResult.toDisplayCruisesResults();
		 Thread.sleep(2000);
		 
		
	 }

	  @AfterClass
	  public void afterClass() {
		  closeDriver();
	  }
}
