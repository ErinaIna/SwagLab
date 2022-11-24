package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class firsttest {
	
    public String baseUrl = "https://www.saucedemo.com/";
    public String driverPath = "C:\\chromedriver.exe";
    public WebDriver driver; 
    public String expected = "Swag Labs";
    public String actual = null;
  
   
   
@BeforeTest
   
public void OpenChrome() {
	
   //initialize browser * get URL
	
	System.setProperty("webdriver.chrome.driver", driverPath);
 	driver = new ChromeDriver();
   
 	driver.get(baseUrl);
 	
 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	
   }

  
@Test (priority=1)

        //LogIN method name
        
public void LogIn () {
        	
          //initialize elements
            
            //username (find with xpath)
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	WebElement  username=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( ("//input[@name='user-name']"))));
    username.sendKeys("standard_user");
    
      //      WebElement  username= driver.findElement(By.xpath("//input[@name='user-name']"));
      //      username.sendKeys("standard_user");
            
            //password
            
            WebElement password= driver.findElement(By.name("password"));
            password.sendKeys("secret_sauce");
            
            //login
           
           WebElement loginButton= driver.findElement(By.id("login-button"));
           loginButton.click();
           
           
        }
   
@Test (priority=0)
        
public void BuyProduct() throws InterruptedException {
	
 //initialize elements
    
    
    //username (find with xpath)
    
    WebElement  username= driver.findElement(By.xpath("//input[@name='user-name']"));
    username.sendKeys("standard_user");
    
    //password
    
    WebElement password= driver.findElement(By.name("password"));
    password.sendKeys("secret_sauce");
    
    //login
    
   WebElement loginButton= driver.findElement(By.id("login-button"));
   loginButton.click();
   
           //add to card
           
           WebElement addToCardButton= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
           addToCardButton.click();
           
           //add to card element 2
           
           WebElement addToCard2=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
           addToCard2.click();
           
           //go to basket again
         
           WebElement goToBasket2= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span"));
           goToBasket2.click();
           
           //remove 1 item
      
         WebElement removeElement= driver.findElement(By.name("remove-sauce-labs-backpack"));
           removeElement.click();
           
           //Checkout
          

           WebElement checkout= driver.findElement(By.id("checkout"));
          checkout.click();

          //checkout info
          
          WebElement checkoutName= driver.findElement(By.id("first-name"));
          checkoutName.sendKeys("Erina");
          
          
          WebElement checkoutSurname= driver.findElement(By.id("last-name"));
          checkoutSurname.sendKeys("Roshi");
          
          
          WebElement checkoutZip= driver.findElement(By.id("postal-code"));
          checkoutZip.sendKeys("1000");
          
          //continue checkout
         
          WebElement continueCheckout = driver.findElement(By.id("continue"));
          continueCheckout.click();
          
          //Finish
         
          WebElement finishCheckout = driver.findElement(By.id("finish"));
          finishCheckout.click();
 
          
          // back home
          Thread.sleep(1000);
          WebElement backHomeButton = driver.findElement(By.id("back-to-products"));
          backHomeButton.click();
          
         // String TitullSelenium= driver.findElement(By.xpath("//h2")).getText();
        //  String ErrorMessageText = "THANK YOU FOR YOUR ORDER";
          
          
          //System.out.println("Mesazhi eshte " + "  " + TitullSelenium );
          
         // Assert.assertEquals(TitullSelenium, ErrorMessageText);
          
        //click threelines
		  Thread.sleep(1000);
		   WebElement threeLines = driver.findElement(By.id("react-burger-menu-btn"));
		   threeLines.click();
		   
		   //logout
		   Thread.sleep(1000);
          WebElement logOut = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
          logOut.click();
         
          
        }


@Test (priority=3)
    
public void TestingFilter () {

    		  
    		   //click filter 
    		   
    		  
    		   WebElement filter= driver.findElement(By.className("product_sort_container"));
    		   filter.click();
    		   
    		   
    			Select PriceLowToHigh = new Select (driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
    			//PriceLowToHigh.selectByVisibleText("Price (low to high)");
    			PriceLowToHigh.selectByValue("lohi");
    	
    			//click threelines
    			
    			   WebElement threeLines = driver.findElement(By.id("react-burger-menu-btn"));
    			   threeLines.click();
    			   
    			   //logout
    		
    	          WebElement logOut = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
    	          logOut.click();
   		
    	}

@Test (priority=4)

public void ClickAbout () throws InterruptedException {
	
	//username (find with xpath)
    WebElement  username= driver.findElement(By.xpath("//input[@name='user-name']"));
    username.sendKeys("standard_user");
    
    //password
    
    WebElement password= driver.findElement(By.name("password"));
    password.sendKeys("secret_sauce");
    
    //login
  
   WebElement loginButton= driver.findElement(By.id("login-button"));
   loginButton.click();
   
  //click threelines
  
   WebElement threeLines = driver.findElement(By.id("react-burger-menu-btn"));
   threeLines.click();
   
   //click about
   
   WebElement aboutButton= driver.findElement(By.id("about_sidebar_link"));
   aboutButton.click();
   
   //click Sign In
   
   WebElement SignIn = driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[3]/ul/li[2]/a"));
   SignIn.click();
   
 //Register username & password
   
   WebElement Name = driver.findElement(By.id("idToken1"));
   Name.sendKeys("eroshi@ritech.co");
   
   WebElement Password1 = driver.findElement(By.id("idToken2"));
   Password1.sendKeys("Testtest1.");
   
   //remember me
   Thread.sleep(1000);
   WebElement rememberMe = driver.findElement(By.id("remember"));
   rememberMe.click();
 
   // click log in
   Thread.sleep(1000);
   WebElement loginButton1 = driver.findElement(By.name("callback_2"));
   loginButton1.click();
   
   Thread.sleep(1000);
   WebElement clickAccount= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div/button/div[2]"));
   clickAccount.click();
   
   Thread.sleep(1000);
   WebElement clickLogout= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div/div/div[4]/div/ul/li[5]/a/span[1]"));
   clickLogout.click();
   
   
}


    	
@AfterTest

public void terminateBrowser3 (){
    driver.close();

}
}

        
      
  