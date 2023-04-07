package Selenium_LINKS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo_link_site {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.freecodecamp.org/%20.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> Links=driver.findElements(By.xpath("//a"));
System.out.println(Links.size());
for (int i =0;i <Links.size();i++)
	System.out.println(Links.get(i).getText()+":"+Links.get(i).getAttribute("href"));
  //if(Links.get(i).getText().equals("Crow’s Foot Notation")) {
		//System.out.println(Links.get(i).getAttribute("href").equals("Crow�s Foot Notation:https://www.freecodecamp.org/news/crows-foot-notation-relationship-symbols-and-how-to-read-diagrams"));
	}
	}

