
	package tests;

	import org.testng.annotations.Test;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
    import main.ClickPhotoPage;
    import main.Hook;
    import main.loginPage1;
	
	public class ClickPhotoTest extends Hook {

	@Test (priority=0)
	
	public void ClickPhoto() {

		new WebDriverWait(driver,20);
		
		loginPage1 login = new loginPage1(driver);
		login.Login("standard_user", "secret_sauce");
		
		ClickPhotoPage ClickPhoto =new ClickPhotoPage(driver);
		ClickPhoto.ClickImageAddToCardAndBackToProductButton();
	}
}
