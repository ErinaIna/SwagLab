package main;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class AccountPage {
	

	//initialize driver & Url
	
	String driverPath = "C:\\chromedriver.exe";
	WebDriver driver;
	String pageURL = "https://www.saucedemo.com/";
			
	//elements

	   
	By ClickAccount= By.xpath("//button[@data-qa='nav-account']");
	  
	By ClickLogout= By.xpath("//ul/button");
	  
	    
	 //constructor

	    public AccountPage (WebDriver driver){
	        this.driver = driver;
	    }

	    public void ClickAccount () {
			   driver.findElement(ClickAccount).click();

		  }
		   
		   public void ClickLogout () {
			   driver.findElement(ClickLogout).click();

		  }
		   
		 //create function
		  
		   public void ClickAccountandLogOut () {
			   
			   ClickAccount();
			   ClickLogout();
			      
		   }
}

