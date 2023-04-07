package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {

	public static void Fail_Screenshot (WebDriver driver) throws IOException {
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
	     String random = RandomString.make(2);
	     File destination= new File ("C:\\Selenium\\06-02-23(Screenshot)\\screenshot practice\\image"+random+".jpg");
	     
	     FileHandler.copy(screenshot, destination);
	     Date d = new Date();
	}
	
}
