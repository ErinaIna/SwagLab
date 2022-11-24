package tests;


	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import main.ClickAboutPage;

	public class AccountSignInTest {
		

		String driverPath = "C:\\chromedriver.exe";
		public WebDriver driver;
		public String pageURL="https://accounts.saucelabs.com/am/XUI/#login/";
		
		
		@BeforeTest
		   
		public void OpenChrome() {
			
		   //initialize browser * get URL
			
			System.setProperty("webdriver.chrome.driver", driverPath);
		 	driver = new ChromeDriver();
		   
		 	driver.get(pageURL);
		 	
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	
		   }
		
		
		@Test
		

		public void ClickAboutAndSignIn () throws InterruptedException {
			
			new WebDriverWait(driver,20);
			
			//loginPage1 login = new loginPage1(driver);
			//login.Login("standard_user", "secret_sauce");
			
			ClickAboutPage accountPage = new ClickAboutPage(driver);
			accountPage.SignInAccount("eroshi@ritech.co", "Testtest1.");
		
		}
		
		@AfterTest
		public void terminateBrowser (){
		    driver.close();
		}
		
	}
			
	
