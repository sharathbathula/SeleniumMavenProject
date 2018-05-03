package Tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import libraries.ExcelUtil;
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
	  Object[][] Data =page.GetInstance(ExcelUtil.class).getExcelData("C:\\Users\\sharath bathula\\Desktop\\Personal Items\\Career Modules\\Project Artifacts\\Selenium\\Practice\\LevisUserDetails_1.xlsx","LevisProfile");	
	  return Data;
	  
  }
    
  

}
