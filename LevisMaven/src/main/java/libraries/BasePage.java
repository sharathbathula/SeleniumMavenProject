package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends PageGenerator{

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public <T> void writeText(T elementAtt,String Text) {
		((WebElement)elementAtt).sendKeys(Text);
	}
	
	public <T> void SelectDropDown(T elementAtt,String Text) {
		Select ele = new Select((WebElement) elementAtt);
		ele.selectByValue(Text);
	}
	
	public <T> void Click(T elementAtt) {
		((WebElement)elementAtt).click();
	}
	
	public <T> String ReadText(T elementAtt) {
		return ((WebElement)elementAtt).getText();
		
	}
}
