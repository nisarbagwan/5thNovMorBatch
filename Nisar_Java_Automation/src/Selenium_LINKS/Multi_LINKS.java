package Selenium_LINKS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_LINKS {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		
		System.out.println(Links.size());
		
		for (int i = 0;i <Links.size();i++) {
		System.out.println(Links.get(i).getText()+":"+Links.get(i).getAttribute("href"));
		
		if (Links.get(i).getText().equals("Developers")) {
			System.out.println(Links.get(i).getText().equals("https://developers.facebook.com/?ref=pf"));
			
		   }
		}
	}
}

