package ScreenShot_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_Basic {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver ();
    // driver.get("https://time.is/India");
     for(int i=1;i<=5;i++) {
     driver.get("https://www.facebook.com/signup");
     File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
     String random = RandomString.make(2);
     File destination= new File ("C:\\Selenium\\06-02-23(Screenshot)\\screenshot practice\\image"+random+".jpg");
     
     FileHandler.copy(screenshot, destination);
     Date d = new Date();
    String result = d.toString();
    System.out.println(result);
    String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
     }
	}

}
