package pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import libraries.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how = How.ID, using = "j_username")
    public WebElement username;
	
	@FindBy(how = How.ID, using = "j_password")
    public WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space(text())='Sign in']")
    public WebElement LoginButton;
	
	@FindBy(how = How.CLASS_NAME, using = "login-error")
    public WebElement LoginErrorMessage;
	
	public void LoginToLevis(String UName,String Pwd) {
		writeText(username, UName);
		writeText(password,Pwd);
		Click(LoginButton);
	}
	
	public void VerifyLoginMessage(String ExpectedText) {
		Assert.assertEquals(ReadText(LoginErrorMessage),ExpectedText );
	}

}
