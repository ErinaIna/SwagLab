package main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BuyProductPage1 {

	//initialize driver & Url
	
		String driverPath = "C:\\chromedriver.exe";
		WebDriver driver;
		String pageURL = "https://www.saucedemo.com/";
		
	  	

		//constructor
		
		  public BuyProductPage1 (WebDriver driver){

		        this.driver = driver;
		     

		    }

		  //initialize elements
		  
		  By addToCardButton = By.id("add-to-cart-sauce-labs-backpack");
		   
		  By addToCard2 = By.id("add-to-cart-sauce-labs-bike-light");
		  
		  By goToBasket2 = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span");
		   
		  By removeElement= By.name("remove-sauce-labs-backpack");
		 
		  By checkout= By.id("checkout");
		  
		  By checkoutName= By.id("first-name");
		  
		  By checkoutSurname= By.id("last-name");
		  
		  By checkoutZip= By.id("postal-code");
		  
		  By continueCheckout = By.id("continue");
		 
		  By finishCheckout = By.id("finish");
		  
		  By logOut = By.xpath("//*[@id=\"logout_sidebar_link\"]");
		  
		  By backHomeButton = By.id("back-to-products");
		  
		  By threeLines = By.id("react-burger-menu-btn");  
		  
		  //initialize function
		  
		  public void addToCardButton () { 
			 driver.findElement(addToCardButton).click();
		  }
		  
		  
		  public void addToCard2 () {
			  driver.findElement(addToCard2).click();
		  }
		  
		  public void goToBassket2 () {
			  driver.findElement(goToBasket2).click();
		  }

		  public void removeElement () {
			  driver.findElement(removeElement).click();
		  }
		  
		  public void checkout () {
			  driver.findElement(checkout).click();
		  }
		  
		  public void checkoutName (String buyersName) {
			  driver.findElement(checkoutName).sendKeys(buyersName);
			  
		  }
		  public void checkoutSurname (String buyersSurname) {
			  driver.findElement(checkoutSurname).sendKeys(buyersSurname); 
		  }
		  
		  public void checkoutZip (String ZipCode) {
			  driver.findElement(checkoutZip).sendKeys(ZipCode); 
		  }
		  
		  public void continueCheckout () {
			  driver.findElement(continueCheckout).click();
		  }
		  
		  public void finishCheckout () {
			  driver.findElement(finishCheckout).click();
		  }
		  
		  public void backHomeButton () {
			  driver.findElement(backHomeButton).click();
		  }
		  
		  public void threeLines () {
			  driver.findElement(threeLines).click();          
		  }
		  
public void ClickLogout () {
			  
			  driver.findElement(logOut).click();
			  
		  }
		  
		  //create function
		  
		  public void BuyProduct (String buyersName, String buyersSurname, String ZipCode) {
			  addToCardButton();
			  addToCard2();
			  goToBassket2();
			  removeElement();
			  checkout();
			  checkoutName(buyersName);
			  checkoutSurname(buyersSurname);
			  checkoutZip(ZipCode);
			  continueCheckout();
			  finishCheckout();
			  backHomeButton ();
			 // threeLines();
			  //ClickLogout ();
			  
	
			  
		  }
}
