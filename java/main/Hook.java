package main;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class Hook {
	
	//initialize driver & Url
	
	String driverPath = "C:\\chromedriver.exe";
	public WebDriver driver;
	public String pageURL="https://www.saucedemo.com/";
	
			
@BeforeClass
	
	public void OpenChrome() {
		
	   //initialize browser * get URL
		
		System.setProperty("webdriver.chrome.driver", driverPath);
	 	driver = new ChromeDriver();
	 	driver.get(pageURL);
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	
	   }

@AfterClass
public void terminateBrowser (){
    driver.close();
}

}
