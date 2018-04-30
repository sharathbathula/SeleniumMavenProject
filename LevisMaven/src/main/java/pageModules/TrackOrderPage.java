package pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import libraries.BasePage;

public class TrackOrderPage extends BasePage{

	public TrackOrderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='orderNumber']")
    public WebElement OrderNumberEditBox;
	@FindBy(how = How.XPATH, using = "//input[@id='emailAddress']")
    public WebElement EmailAddressEditBox;
	@FindBy(how = How.XPATH, using = "//button[normalize-space(text())='TRACK']")
    public WebElement TrackButton;
	@FindBy(how = How.XPATH, using = "//label[@for='orderNumber'][@class='invalid']")
    public WebElement InvalidOdernomessage;
	@FindBy(how = How.XPATH, using = "//label[@for='emailAddress'][@class='invalid']")
    public WebElement InvalidemailAddressMessage;
	
	public void EnterOrderNumberandEmailAddress(String Order,String EmailAddress) {
		writeText(OrderNumberEditBox, Order);
		writeText(EmailAddressEditBox, EmailAddress);
		Click(TrackButton);
	}
	
	public void VerifyOrderNumberMessage(String ExpectedText) {
		Assert.assertEquals(ReadText(InvalidOdernomessage), ExpectedText);
	}
	
	public void VerifyEmailAddressMessage(String ExpectedText) {
		Assert.assertEquals(ReadText(InvalidemailAddressMessage), ExpectedText);
	}
	

}
