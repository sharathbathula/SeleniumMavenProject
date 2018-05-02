package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageModules.HomePage;
import pageModules.LoginPage;



public class LoginTests extends BaseTests{
  @Test(dataProvider="LoginData")
  public void InvalidLoginDetails(String UserName,String Password) {
	  page.GetInstance(HomePage.class).goToLevisHomePage();
	  page.GetInstance(HomePage.class).gotoLoginPage();
	  page.GetInstance(LoginPage.class).LoginToLevis(UserName, Password);
	  page.GetInstance(LoginPage.class).VerifyLoginMessage("The email and/or password you entered is incorrect. Please try again.");
	  
  }
  
  @DataProvider(name="LoginData")
  public Object[][] TestLogin(){
	  
	return new Object[][] {{"userName@gmail.com","password"},{"Hello@gmail.com","Hi"}};
	  
  }
  

}
