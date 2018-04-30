package Tests;

import org.testng.annotations.Test;

import pageModules.HomePage;
import pageModules.LoginPage;



public class LoginTests extends BaseTests{
  @Test
  public void InvalidLoginDetails() {
	  page.GetInstance(HomePage.class).goToLevisHomePage();
	  page.GetInstance(HomePage.class).gotoLoginPage();
	  page.GetInstance(LoginPage.class).LoginToLevis("nn", "mm");
	  page.GetInstance(LoginPage.class).VerifyLoginMessage("The email and/or password you entered is incorrect. Please try again.");
	  
  }
  

}
