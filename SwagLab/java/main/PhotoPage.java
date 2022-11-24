package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



	
	 public class PhotoPage {
		 
		//initialize driver & Url
			
			String driverPath = "C:\\chromedriver.exe";
			WebDriver driver;
			String pageURL = "https://www.saucedemo.com/";
			
			//elements
 
    	By BackToProduct = By.id("back-to-products");
    	By AddToCard= By.id("add-to-cart-sauce-labs-backpack");
    	
    //constructor
    	
    	public PhotoPage (WebDriver driver){

            this.driver = driver;
    	
    }
	
    	 public void selectElement() {
    	    	driver.findElement(AddToCard).click();
    	    }
    	 
    	 public void BackToProductButton() {
    		 driver.findElement(BackToProduct).click();
    		 
    	 }
	
    	 
    	 //function
    	 
    	 
    	 public void ClickBackToProductButton () {
    		 BackToProductButton();
    	 }
    	 
}
