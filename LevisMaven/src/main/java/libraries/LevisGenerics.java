package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import pageModules.HomePage;
import pageModules.LoginPage;

public class LevisGenerics extends BasePage{

	public LevisGenerics(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public <T> void L_sendKey() {
		System.out.println("Heya ..This is a Test");
	}
	
	public HomePage GotoHomePage() {
		return PageFactory.initElements(driver, HomePage.class);
	}

	public LoginPage GotoLoginPage() {
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
