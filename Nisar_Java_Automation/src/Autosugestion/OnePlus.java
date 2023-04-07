package Autosugestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("oneplus");
		
		List<WebElement> opt= driver.findElements(By.xpath("//div[@class='erkvQe']"));
		System.out.println(opt.size());
		
		for(int i=0;i<opt.size();i++) {
		
			System.out.println(opt.get(i).getText());
		}
	}

}
