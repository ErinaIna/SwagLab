package main;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class SignInPage {
	

	//initialize driver & Url
	
	String driverPath = "C:\\chromedriver.exe";
	WebDriver driver;
	String pageURL = "https://www.saucedemo.com/";
			
	//elements

	By SignInIcon = By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[3]/ul/li[2]/a");
	    
	    
	 //constructor

	    public SignInPage (WebDriver driver){
	        this.driver = driver;
	    }

	    public void Signin() {
	    	driver.findElement(SignInIcon).click();	  
	    	}
	    
	    //complete
	    
	    public void ClickSignInIcon() {
	    	Signin();
	    }

}
