package Tests;

import org.testng.annotations.Test;

import pageModules.HomePage;
import pageModules.TrackOrderPage;

public class TrackNumberTests extends BaseTests {
  @Test
  public void BlankOrderNumberTest() {
	  page.GetInstance(HomePage.class).goToLevisHomePage();
	  page.GetInstance(HomePage.class).gotoTrackPage();
	  page.GetInstance(TrackOrderPage.class).EnterOrderNumberandEmailAddress("", "Sharath.bathula@gmail.com");
	  page.GetInstance(TrackOrderPage.class).VerifyOrderNumberMessage("Please enter a valid order number.");
  }
  
  @Test
  public void BlankEmailAddressTest() {
	  page.GetInstance(HomePage.class).goToLevisHomePage();
	  page.GetInstance(HomePage.class).gotoTrackPage();
	  page.GetInstance(TrackOrderPage.class).EnterOrderNumberandEmailAddress("54879", "");
	  page.GetInstance(TrackOrderPage.class).VerifyEmailAddressMessage("Please enter a valid email address.");
  }
  
  @Test(enabled=false)
  public void BlankOrdernumberandEmailAddressTest() {
	  page.GetInstance(HomePage.class).goToLevisHomePage();
	  page.GetInstance(HomePage.class).gotoTrackPage();
	  page.GetInstance(TrackOrderPage.class).EnterOrderNumberandEmailAddress("", "");
	  page.GetInstance(TrackOrderPage.class).VerifyOrderNumberMessage("Please enter a valid order numbr.");
	  page.GetInstance(TrackOrderPage.class).VerifyEmailAddressMessage("Please enter a valid email address.");
  }
  
}
