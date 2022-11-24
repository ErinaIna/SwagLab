package main;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
public class Hook implements ITestListener {
	
	//initialize driver & Url
	
	String driverPath = "C:\\chromedriver.exe";
	public static WebDriver driver;
	public String pageURL="https://www.saucedemo.com/";
	
			
@BeforeClass
	
	public void OpenChrome() {
		
	   //initialize browser * get URL
	 System.setProperty("webdriver.chrome.whitelistedIps", "");
		System.setProperty("webdriver.chrome.driver", driverPath);
	 	driver = new ChromeDriver();
	 	driver.get(pageURL);
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	
	   }


 public void onTestFailure(ITestResult result) {
	   
	
	
		try {
			 
			  File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 Date d= new Date();
				 String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
				
					 FileUtils.copyFile(srcFile, new File("C://Screenshots/" + result.getName() + "_"+ TimeStamp+".png" ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }   


@AfterClass
public void terminateBrowser (){
    driver.quit();
}

}
