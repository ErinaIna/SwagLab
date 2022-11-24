package tests;

	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	
	import main.SocialMediaPage;
	
	public class TwitterExploreTest {
		
		String driverPath = "C:\\chromedriver.exe";
		public WebDriver driver;
		public String pageURL="https://twitter.com/saucelabs";
		
		@BeforeTest
		public void OpenChrome() {
			
		   //initialize browser * get URL
			
			System.setProperty("webdriver.chrome.driver", driverPath);
		 	driver = new ChromeDriver();
		 	driver.get(pageURL);
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	
		   }
		
		@Test (priority=0)
	    public void TwitterExplore () throws InterruptedException {
			
			new WebDriverWait(driver,20);
			
			Thread.sleep(1000);
		SocialMediaPage twitterSettings = new SocialMediaPage (driver);
		twitterSettings.TwitterSettingsAndCheckbox();
		
		}
	
	
	}

