package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageGenerator {
	public WebDriver driver;
	
	public PageGenerator(WebDriver driver) {
		this.driver = driver;
	}

	public <TPage extends BasePage> TPage GetInstance(Class<TPage> PageClass)
	{
		return PageFactory.initElements(driver, PageClass);
		
		
	}
	

}
