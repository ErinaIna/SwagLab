
package main;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	//initialize driver & Url
	
	String driverPath = "C:\\chromedriver.exe";
	WebDriver driver;
	String pageURL = "https://www.saucedemo.com/";
			
	//elements

    By AddToCard= By.id("add-to-cart-sauce-labs-backpack");
    By ShoppingBasket= By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By ClickPhoto= By.id("item_1_img_link");
    By filter= By.className("product_sort_container");
	By PriceLowToHigh = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
	By ThreeLines = By.id("react-burger-menu-btn");
	By AboutButton= By.id("about_sidebar_link");
	
	   
    //constructor

    public ProductPage (WebDriver driver){

        this.driver = driver;

    }

    public void ClickThreeLines () {
		   driver.findElement(ThreeLines).click();
	   }
	   
	   public void ClickAboutButton () {
		   driver.findElement(AboutButton).click();
	   }
	   
    public void AddToCard() {
    	driver.findElement(AddToCard).click();
    }
    
    //click 
    public void ClickShoppingBasket() {
    	driver.findElement(ShoppingBasket).click();
    }
    
    //click photo
    public void ClickPhoto() {
    	driver.findElement(ClickPhoto).click();
    }
    
  
	   
	//Click filter
	   public void ClickFilter() {
			  driver.findElement(filter).click();
		  }
		  
    //Choose filter 
		  public void SelectPriceToLow (String vlera) throws InterruptedException {
			Select PriceLowToHigh = new Select (driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
			PriceLowToHigh.selectByValue(vlera);
			
		  }
		  
	//function
		  
		 
		  
		  public void ClickOnPhoto() {
			  ClickPhoto();
		  }
		  
		  public void AddToCardItem() {
			  AddToCard();
		  }
		  
		  public void FilterElements(String vlera) throws InterruptedException {
			  ClickFilter();
			  SelectPriceToLow (vlera);
		  }
		  
		  public void SelectShoppingBasket() {
			  ClickShoppingBasket();
			  
		  }
		  
		  
		  public void SelectProductAndClickBasket() {
			  AddToCardItem();
			  SelectShoppingBasket();
		  }
		public void ClickThreeLinesAndAbout() {
			ClickThreeLines () ;
		    ClickAboutButton();
		}
			  
		  }

