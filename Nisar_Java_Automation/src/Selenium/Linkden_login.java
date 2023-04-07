package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkden_login {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();  
	
	driver.get("https://www.linkedin.com/signup");
	//driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='email-or-phone']")).sendKeys("nisarbagwan2100@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Khadija@2100");
	
	WebElement cont = driver.findElement(By.xpath("//button[@type='submit']"));

	boolean result = cont.isEnabled();
	System.out.println(result);
	if (result==true) {
System.out.println("butten is enbaled");
		}else {
			System.out.println("button is disebled");
		}
	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	driver.findElement(By.xpath("//a[text()='Accessibility']")).click();
//	Thread.sleep(2000);
//	driver.navigate().back();
//	
//	driver.findElement(By.xpath("(//a[text()='Privacy Policy'])[1]")).click();
//	Thread.sleep(2000);
//	driver.navigate().back();
//	
//	
//	driver.navigate().refresh();
//
//	String title =driver.getTitle();
//	String expectedtitle = driver.getTitle();
//	if (title.equalsIgnoreCase(expectedtitle)) {
//		System.out.println("current page is correct");
//	}
//	else {
//		System.out.println("not corrected");
//	}
	
	
}
}
