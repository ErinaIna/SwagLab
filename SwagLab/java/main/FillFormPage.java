package main;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	
	public class FillFormPage {

		//initialize driver & Url
		
		String driverPath = "C:\\chromedriver.exe";
		WebDriver driver;
		String pageURL = "https://www.saucedemo.com/";
				
		//elements

	    By FirstName= By.id("first-name");
	    By LastName= By.id("last-name");
	    By Zip= By.id("postal-code");
	    By ContinueButton= By.id("continue");

	    public FillFormPage (WebDriver driver){

	        this.driver = driver;

	    }

	    //Set user name in textbox
	    public void setFirstName(String firstname) {
	    	driver.findElement(FirstName).sendKeys(firstname);
	    }
	    public void setLastName(String lastname) {
	    	driver.findElement(LastName).sendKeys(lastname);
	    }
	    public void setZip(String zipN) {
	    	driver.findElement(Zip).sendKeys(zipN);
	    }
	    public void clickContinue() {
	    	driver.findElement(ContinueButton).click();
	    }
	    public void fillForm(String firstname,String lastname,String zipN) {
	    	
	    	setFirstName(firstname);
	    	setLastName(lastname);
	    	setZip(zipN);
	    	
	    	
	    }
	    
	}


