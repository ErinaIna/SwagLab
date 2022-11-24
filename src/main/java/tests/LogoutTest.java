
	package tests;

	import org.testng.annotations.Test;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import main.Hook;
	import main.loginPage1;
	import main.ClickAboutPage;
	

	public class LogoutTest extends Hook {
		
		@Test (priority=0)
		
	public void Logout () throws InterruptedException {
			
			new WebDriverWait(driver,20);
			
			loginPage1 login= new loginPage1(driver);
			login.Login("standard_user", "secret_sauce");

			ClickAboutPage aboutPage= new ClickAboutPage(driver);
			aboutPage.ClickThreeLines();
			
		loginPage1 logout = new loginPage1(driver);
		logout.clickLogoutButton();
			
		}
	}


