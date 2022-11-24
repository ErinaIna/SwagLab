package main;


	
	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	public class CheckoutCompletePage {

		//initialize driver & Url
		
		String driverPath = "C:\\chromedriver.exe";
		WebDriver driver;
		String pageURL = "https://www.saucedemo.com/";
		
		//elements

	    By BackHomeButton= By.id("back-to-products");
	    
	    //constructor
	    
	    public CheckoutCompletePage (WebDriver driver){

	        this.driver = driver;

	    }
	    
	    

	public void BackHomeButton() {
		driver.findElement(BackHomeButton).click();
		
	}

	

	//function

	public void ClickBackHomeButton() {
		BackHomeButton();
		
	}

	

}
