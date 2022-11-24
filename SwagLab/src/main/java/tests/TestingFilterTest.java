package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.Hook;
import main.TestingFilterPage;
import main.loginPage1;
@Listeners(Hook.class)
public class TestingFilterTest extends Hook {

		@Test
		public void TestingFilter () throws InterruptedException {
			
			new WebDriverWait(driver,3);
			
			loginPage1 login = new loginPage1 (driver);
			login.Login("standard_user", "secret_sauce");
			
			TestingFilterPage testingfilter = new TestingFilterPage (driver);
			testingfilter.SelectFilter("lohi");	
		}
	}

