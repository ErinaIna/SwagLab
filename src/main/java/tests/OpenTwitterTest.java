
	package tests;

	import org.testng.annotations.Test;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import main.loginPage1;
    import main.Hook;
    import main.SocialMediaPage;
	
	public class OpenTwitterTest extends Hook {

		@Test (priority=0)
		
	public void Login () throws InterruptedException {
			
			new WebDriverWait(driver,20);
			
			loginPage1 login= new loginPage1(driver);
			login.Login("standard_user", "secret_sauce");
			
			SocialMediaPage twitter= new SocialMediaPage(driver);
			twitter.ClickTwitterButton();
			
		}
	}

