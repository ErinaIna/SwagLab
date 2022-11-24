package tests;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.Hook;
import main.loginPage1;

public class MissingCredentialsTest extends Hook {

	@Test (priority=0)
	
public void Login () {
		
		new WebDriverWait(driver,20);
		
		loginPage1 login= new loginPage1(driver);
		login.Login("", "");
		
		String ErrorMessageText = "Epic sadface: Username is required";
		
		String TitullSelenium= driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	    
	    System.out.println("Mesazhi errorit eshte " + "  " + TitullSelenium );
		
	    Assert.assertEquals(TitullSelenium, ErrorMessageText);
	}
}
