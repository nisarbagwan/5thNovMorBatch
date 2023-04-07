package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_goto_webinar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.gotowebinar.com/recording/2853363944786803456");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("nisar");

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bagwan");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nisarbagwan2100@gmail.com");
		
		WebElement Register = driver.findElement(By.xpath("//button[@type='submit']"));
		Register.isEnabled();
		boolean result = Register.isEnabled();
		System.out.println(result);
		if (result== true) {
			System.out.println("given tab is Enabled" );
		}else {
           System.out.println("given tab is not Enabled");			
		}
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		///Thread.sleep(3000);
	}

}
