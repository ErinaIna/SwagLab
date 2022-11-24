package main;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listener implements ITestListener {
	public static  WebDriver driver;
	 
	 public void onTestFailure(ITestResult result) {
		   
			
			
			try {
				 
				  File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					 Date d= new Date();
					 String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
					
						 FileUtils.copyFile(srcFile, new File("C://Screenshots/" + result.getName() + "_"+ TimeStamp+".png" ));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }   

}
