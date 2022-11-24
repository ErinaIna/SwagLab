package tests;

	import org.testng.annotations.Test;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import main.ClickAboutPage;
    import main.Hook;
    import main.loginPage1;

	public class SignInTest extends Hook  {

		@Test
		public void ClickAboutAndSignIn () throws InterruptedException {
			
			new WebDriverWait(driver,20);
			
			loginPage1 login = new loginPage1(driver);
			login.Login("standard_user", "secret_sauce");
			
			ClickAboutPage AboutPage = new ClickAboutPage(driver);
			AboutPage.ClickAboutAndSignIn("eroshi@ritech.co", "Testtest1.");
		
		}
	}
			
		

