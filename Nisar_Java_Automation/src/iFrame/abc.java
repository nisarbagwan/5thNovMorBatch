package iFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class abc {
	public static void main(String[] args) {
		//System.setProperty("WebDriver.driver.Chrome", "C:\\JAR FILES\\chrome driver\\chromedriver_win32.zip");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		
		//WebDriver driver1 = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//driver1.get("https://www.GOOGLE.com/");
	}
	
	
	
}
