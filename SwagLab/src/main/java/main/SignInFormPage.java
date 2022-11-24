package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInFormPage {
	

	//initialize driver & Url
	
	String driverPath = "C:\\chromedriver.exe";
	WebDriver driver;
	String pageURL = "https://www.saucedemo.com/";
			
	//elements

	//Register username & password
	   
	  By Name = By.id("idToken1");
	   
	  By Password1 = By.id("idToken2");
	   
	   By RememberMe = By.xpath("//*[@class='checkmark']");
	  
	  By LoginButton1 = By.name("callback_2");
	    
	 //constructor

	    public SignInFormPage (WebDriver driver){
	        this.driver = driver;
	    }

	    public void Name (String UserName) {
			   driver.findElement(Name).sendKeys(UserName);
			   
		   }
		   
		   public void Password1 (String NewPassword) {
			   driver.findElement(Password1).sendKeys(NewPassword);
		   }
		   
		   public void RememberMe () {
			   driver.findElement(RememberMe).click();

		  }
		   
		   public void LoginButton1 () {
			   driver.findElement(LoginButton1).click();

		  }
		   
	    
		 //create function
			  
		   public void SignInFill(String UserName, String NewPassword) {
			   
			   Name(UserName);
			   Password1(NewPassword);
			   RememberMe();
			   LoginButton1();
			   
			      
		   }
	 
}



