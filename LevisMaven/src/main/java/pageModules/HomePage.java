package pageModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import libraries.LevisGenerics;

public class HomePage extends LevisGenerics{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Navigate to URL
	String BaseUrl = "https://www.levi.com";
	
    @FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Sign in'][@class='signin-signout-link']")
    public WebElement SignIn;
    
    @FindBy(how = How.XPATH, using = "//a[@title='Track Order']")
    public WebElement TrackOrderLink;
    
    //Goto HomePage
    public void goToLevisHomePage() {
    	driver.get(BaseUrl);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    //Goto SignInPage
    public void gotoLoginPage() {
    	Click(SignIn);
    	System.out.println("hello");
    	
    }
    
    //Goto SignInPage
    public void gotoTrackPage() {
    	Click(TrackOrderLink);
    	
    }
    	

}
