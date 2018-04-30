package Tests;

import org.testng.annotations.Test;

import libraries.PageGenerator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTests {
  
	public WebDriver driver;
	public PageGenerator page;
@Parameters("browser")
  @BeforeClass
  public void Setup(String browser) {
	  if(browser.equalsIgnoreCase("ie")) {
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\sharath bathula\\Desktop\\Personal Items\\Career Modules\\Project Artifacts\\Selenium\\Executables\\IEDrivers\\IEDriverServer_Win32_3.11.1\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver(); 
	  
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sharath bathula\\Desktop\\Personal Items\\Career Modules\\Project Artifacts\\Selenium\\Executables\\MozillaDrivers\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		  driver = new FirefoxDriver();  
	  }
	  else {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharath bathula\\Desktop\\Personal Items\\Career Modules\\Project Artifacts\\Selenium\\Executables\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
		  
	  driver.manage().window().maximize();
	  page = new PageGenerator(driver);
  }

  @AfterClass
  public void Teardown() {
	  driver.quit();
  }

}
