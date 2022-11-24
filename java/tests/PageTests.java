package tests;

	import org.testng.annotations.Test;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import main.loginPage1;
    import main.CheckoutCompletePage;
    import main.CheckoutOverviewPage;
    import main.FillFormPage;
    import main.Hook;
    import main.ProductPage;
    import main.YourCardPage;
    import main.AccountPage;
    import main.SignInPage;
    import main.SignInFormPage;
 
	public class PageTests extends Hook {
		
	@Test (priority=0)	
	public void Login () {
			
			new WebDriverWait(driver,20);
			
			loginPage1 login= new loginPage1(driver);
			login.Login("standard_user", "secret_sauce");
	
		}
	
		@Test (priority=1)
		public void BuyProductNew () {
			
			new WebDriverWait(driver,20);
			
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
	
		@Test (priority=2)
		
		public void SignInAccount() {
			
			ProductPage productPage = new ProductPage(driver);
			productPage.ClickThreeLinesAndAbout();
			
			SignInPage signInPage = new SignInPage(driver);
			signInPage.ClickSignInIcon();
			
			SignInFormPage signInForm = new SignInFormPage(driver);
			signInForm.SignInFill("eroshi@ritech.co", "Testtest1.");
			
			AccountPage accountPage=new AccountPage(driver);
			accountPage.ClickAccountandLogOut();
			
		}
		
/*	     @Test (priority=1)
		public void BuyProduct () {
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			//loginPage1 login = new loginPage1 (driver);
			//login.Login("standard_user", "secret_sauce");
			
			BuyProductPage1 buyProduct = new BuyProductPage1 (driver);
			buyProduct.BuyProduct("Erina","Roshi", "1000");

		}
		
		
		@Test (priority=3)
		public void TestingFilter () throws InterruptedException {
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			loginPage1 login = new loginPage1 (driver);
			login.Login("standard_user", "secret_sauce");
			
	
			TestingFilterPage testingfilter = new TestingFilterPage (driver);
			testingfilter.SelectFilterWithoutLogOut("lohi");
			}
		

		@Test (priority=4)
		public void ClickAbout () {
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			//loginPage1 login = new loginPage1 (driver);
			//login.Login("standard_user", "secret_sauce");
			
			ClickAboutPage AboutPage = new ClickAboutPage(driver);
			AboutPage.ClickAboutAndSignIn("eroshi@ritech.co", "Testtest1.");
		
		}

		@Test (priority=2)
		public void ClickPhoto() {

			WebDriverWait wait = new WebDriverWait(driver,20);
			
			ClickPhotoPage ClickPhoto =new ClickPhotoPage(driver);
			ClickPhoto.ClickThePhoto();
		}
		*/

	}


