package main;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
	
	//initialize driver & Url
	
			String driverPath = "C:\\chromedriver.exe";
			WebDriver driver;
			String pageURL = "https://www.saucedemo.com/";
			
	//elements

    By FinishButton= By.id("finish");
    By CancelButton= By.id("cancel");


    public CheckoutOverviewPage (WebDriver driver){

        this.driver = driver;

    }

public void FinishButton() {
	driver.findElement(FinishButton).click();
	
}

public void CancelButton() {
	driver.findElement(CancelButton);
}

//function

public void ClickFinishButton() {
	FinishButton();
	
}

public void ClickCancelButton() {
	CancelButton();
	
}

}
