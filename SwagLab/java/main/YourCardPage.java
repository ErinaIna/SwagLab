package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCardPage {
	

	//initialize driver & Url
	
	String driverPath = "C:\\chromedriver.exe";
	WebDriver driver;
	String pageURL = "https://www.saucedemo.com/";
			
	//elements

	    By Checkout= By.id("checkout");
	    
	    By ContinueShopping= By.id("continue-shopping");
	    
	    By RemoveElement = By.name("remove-sauce-labs-backpack");
	    
	    By ThreeLines = By.id("react-burger-menu-btn");  
	    		
	    By XButton =By.id("react-burger-cross-btn");
	    
	    
	 //constructor

	    public YourCardPage (WebDriver driver){
	        this.driver = driver;
	    }

	    
	    public void Checkout() {
	    	driver.findElement(Checkout).click();
	    }
	    
	   
	   //Click Continue Shopping Button
	   public void ContinueShopping() {
		   driver.findElement(ContinueShopping).click();
	   }
	    
	   //remove 1 item
	   public void RemoveElement() {
		   driver.findElement(RemoveElement).click();
	   }
	   
	   //click ThreeLines
	   public void ThreeLines() {
		   driver.findElement(ThreeLines).click();
		   }
    
	 //Click X Button
	   public void XButton () {
		   driver.findElement(XButton).click();
	   } 
	    
	   

}

