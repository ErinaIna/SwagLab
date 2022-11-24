package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

		 

public class TestingFilterPage {

	//initialize driver & Url
	
			String driverPath = "C:\\chromedriver.exe";
			WebDriver driver;
			String pageURL = "https://www.saucedemo.com/";
			

		//constructor
			
	 public TestingFilterPage (WebDriver driver){
	  this.driver = driver;
	   }

	   //initialize elements

		  By filter= By.className("product_sort_container");
		   
		  By PriceLowToHigh = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
		
		  By ThreeLines = By.id("react-burger-menu-btn");
			   
		  By logOut = By.xpath("//*[@id=\"logout_sidebar_link\"]");
		  

		  
		  
		  public void ClickFilter() {
			  driver.findElement(filter).click();
			 
		  }
		  
		  
		  public void SelectPriceToLow (String vlera) throws InterruptedException {
			  Thread.sleep(2000);
			  
			Select PriceLowToHigh = new Select (driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
  		
  			PriceLowToHigh.selectByValue(vlera);
			
			
		  }
		

public void ThreeLines () throws InterruptedException {
			  Thread.sleep(2000);
			  driver.findElement(ThreeLines).click();
			  
		  }
		  
		  public void ClickLogout () {
			  
			  driver.findElement(logOut).click();
			  
		  }
		  
		  //complete 
		  
		  public void SelectFilter(String vlera) throws InterruptedException {
		  ClickFilter();
		  SelectPriceToLow(vlera);
		  ThreeLines();
		  ClickLogout();		  
		  
		  
		  }
		  
		  public void SelectFilterWithoutLogOut(String vlera) throws InterruptedException {
			  ClickFilter();
			  SelectPriceToLow(vlera);
			  ThreeLines();
			  
			  
			  }
	}



