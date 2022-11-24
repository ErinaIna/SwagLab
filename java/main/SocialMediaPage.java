
	package main;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;



	public class SocialMediaPage {
		
		//initialize driver & Url
		
		String driverPath = "C:\\chromedriver.exe";
		WebDriver driver;
		String pageURL = "https://www.saucedemo.com/";
		

		//constructor
		
		  public SocialMediaPage(WebDriver driver){

		        this.driver = driver;

		    }

		  //initialize elements
		  
		  
		  By Twitter =By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a");
		  By TwitterSettings=By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div/div[2]/nav/a[2]/div");
		  By PersonalisationTwitter= By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/section[1]/div[2]/div/div[2]/a/div/div/div[1]/span");
          By SwitchButtonTwitter= By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/section[2]/div[2]/div/div[2]/div/label/div[1]/div[2]/input");
		  By ConfirmButtonTwitter = By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div/span/span");
		  By CheckboxTwitter = By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/section[2]/div[2]/div/div[5]/div/div/label/div/div[2]/input");
          //methods

		  //click twitter
		   public void ClickTwitter() {
			   driver.findElement(Twitter).click();
		   }
		   
		   public void ClickTwitterSettings () {
			   driver.findElement(TwitterSettings).click();
		   }
		   
		   public void PersonalisationTwitter () {
			   driver.findElement(PersonalisationTwitter).click();
		   }
		   
		   public void SwitchButtonTwitter() {
			   driver.findElement(SwitchButtonTwitter).click();
		   }
		   
		   public void ConfirmButtonTwitter() {
			   driver.findElement(ConfirmButtonTwitter).click();
			   
		   }
		   
		   public void CheckboxTwitter () {
			   driver.findElement(CheckboxTwitter).click();
		   }
		   
		   //complete function
		  
		   public void ClickTwitterButton() {
				  ClickTwitter();
			  }
			
	
		   public void TwitterSettings() {
			   ClickTwitterSettings ();
			   PersonalisationTwitter ();
			   SwitchButtonTwitter();
			   ConfirmButtonTwitter();
			  }
		   
		   public void TwitterSettingsAndCheckbox() {
			   ClickTwitterSettings ();
			   PersonalisationTwitter ();
			   CheckboxTwitter ();
		   }


}
