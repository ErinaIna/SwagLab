package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.CheckoutCompletePage;
import main.CheckoutOverviewPage;
import main.FillFormPage;
import main.Hook;
import main.ProductPage;
import main.YourCardPage;
import main.loginPage1;

public class BuyProductTest extends Hook {
	
	@Test (priority=1)
	
	public void BuyProductNew () {
		
		new WebDriverWait(driver,20);
		
		loginPage1 login = new loginPage1(driver);
		login.Login("standard_user", "secret_sauce");
		
		ProductPage productPage = new ProductPage(driver);
		productPage.SelectProductAndClickBasket();
		
		YourCardPage cardPage= new YourCardPage(driver);
		cardPage.Checkout();
		
		FillFormPage fillForm = new FillFormPage(driver);
		fillForm.fillForm("Erina", "Roshi", "1000");
		fillForm.clickContinue();
		
		CheckoutOverviewPage checkoutOverview = new CheckoutOverviewPage (driver);
		checkoutOverview.ClickFinishButton();
		
		CheckoutCompletePage checkoutComplete=new CheckoutCompletePage(driver);
		checkoutComplete.BackHomeButton();
	
	}
}

