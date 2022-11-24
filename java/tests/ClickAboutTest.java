package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import main.ClickAboutPage;
import main.Hook;
import main.loginPage1;

public class ClickAboutTest extends Hook {

	@Test
	public void ClickAbout () throws InterruptedException {
		
		new WebDriverWait(driver,20);
		
		loginPage1 login = new loginPage1(driver);
		login.Login("standard_user", "secret_sauce");
		
		ClickAboutPage AboutPage = new ClickAboutPage(driver);
		AboutPage.ClickAbout();
	}
}
