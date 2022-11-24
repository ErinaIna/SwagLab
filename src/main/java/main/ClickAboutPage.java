package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ClickAboutPage {

	//initialize driver & Url
	
		String driverPath = "C:\\chromedriver.exe";
		WebDriver driver;
		String pageURL = "https://www.saucedemo.com/";
		

	//constructor
		
		  public ClickAboutPage (WebDriver driver){
		        this.driver = driver;
		    }

   //initialize elements
		 
		  
		  By ThreeLines = By.id("react-burger-menu-btn");
		  
		  By AboutButton= By.id("about_sidebar_link");
		   
		  By SignIn = By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[3]/ul/li[2]/a");
		  
		  //Register username & password
		   
		  By Name = By.id("idToken1");
		   
		  By Password1 = By.id("idToken2");
		   
		  By RememberMe = By.xpath("//*[@class='checkmark']");
		  
		  By LoginButton1 = By.name("callback_2");
		   
		  By ClickAccount= By.xpath("//button[@data-qa='nav-account']");
		  
		  By ClickLogout= By.xpath("//ul/button");
		  
		   public void ClickThreeLines () {
			   driver.findElement(ThreeLines).click();
		   }
		   
		   public void ClickAboutButton () {
			   driver.findElement(AboutButton).click();
		   }

		   public void SignIn () {
			   driver.findElement(SignIn).click();

		  }
		   
		   public void Name (String UserName) {
			   driver.findElement(Name).sendKeys(UserName);
			   
		   }
		   
		   public void Password1 (String NewPassword) {
			   driver.findElement(Password1).sendKeys(NewPassword);
		   }
		   
		   public void RememberMe () throws InterruptedException {
			 

			   driver.findElement(RememberMe).click();

		  }
		   
		   public void LoginButton1 () {
			   driver.findElement(LoginButton1).click();

		  }
		   
		   public void ClickAccount () {
			   driver.findElement(ClickAccount).click();

		  }
		   
		   public void ClickLogout () {
			   driver.findElement(ClickLogout).click();

		  }
		   
		 //create function
		   
		   public void ClickAbout() throws InterruptedException {
			   ClickThreeLines();
			   ClickAboutButton();
			      
		   }
		  
		   public void ClickAboutAndSignIn(String UserName, String NewPassword) throws InterruptedException {
			   ClickThreeLines();
			   ClickAboutButton();
			   SignIn();
			   Name(UserName);
			   Password1(NewPassword);
			   RememberMe();
			   LoginButton1();
			   ClickAccount();
			      
		   }
		   
		   public void ClickAboutAndSignInAndLogout(String UserName, String NewPassword) throws InterruptedException {
			   ClickThreeLines();
			   ClickAboutButton();
			   SignIn();
			   Name(UserName);
			   Password1(NewPassword);
			   RememberMe();
			   LoginButton1();
			   ClickAccount();
			   ClickLogout();
			      
		   }
		   
		   public void SignInAccount(String UserName, String NewPassword) throws InterruptedException{
			   Name(UserName);
			   Password1(NewPassword);
			   RememberMe();
			   LoginButton1();
		   }
		   
		   public void LogoutAccount(String UserName, String NewPassword) throws InterruptedException {
			 
			   Name(UserName);
			   Password1(NewPassword);
			   RememberMe();
			   LoginButton1();
			   ClickAccount();
			   ClickLogout();
			      
		   }
}

