package main;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



public class loginPage1 {
	
	//initialize driver & Url
	
	String driverPath = "C:\\chromedriver.exe";
	WebDriver driver;
	String pageURL = "https://www.saucedemo.com/";
	

	//constructor
	
	  public loginPage1(WebDriver driver){

	        this.driver = driver;

	    }

	  //initialize elements
	  
	  //username,password and login element
	  
	  By userName = By.name("user-name");

	  By password = By.name("password");

	  By login = By.name("login-button");
	  
	  By logout=  By.id("logout_sidebar_link");
	  
	  By TitullSelenium= By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");
	  
	  		
	  
	  //initialize functions
	  
	  
	  //set username in text field
	  
	  public void setUserName (String strUsername) { 
		  driver.findElement(userName).sendKeys(strUsername);
		  
	  }
	  
	  //set password in text field
	  public void setPassword (String strPassword) {
		  driver.findElement(password).sendKeys(strPassword);
	  }
	  
	  //click login button
	  
	  public void clickLoginButton () {
		  driver.findElement(login).click();
	  }
	  
//click logout button
	  
	  public void clickLogoutButton () {
		  driver.findElement(logout).click();
	  }
	  
	
	  public void TitullSelenium () {
		  driver.findElement(TitullSelenium).getText();
		 
	  }
	  
	  //complete the process
	  
	public void Login (String strUserName, String strPassword ) {
		setUserName(strUserName);
		setPassword(strPassword);
		clickLoginButton();
		
	}
	
	public void Logout () {
		clickLogoutButton();
		
		
		
	}

}
