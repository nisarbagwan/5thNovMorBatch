package Selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class Web_page {

	public static void main(String[] args) throws InterruptedException {

//WebDriver driver= new ChromeDriver();
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette",true);
		//System.setProperty("WebDriver.firefox.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//driver.get("https://www.youtube.com");
		//capabilities.setBrowserName("https://www.youtube.com");
		driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

	}
}
