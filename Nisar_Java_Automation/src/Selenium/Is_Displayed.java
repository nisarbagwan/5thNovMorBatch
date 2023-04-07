package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Nisar");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bagwan");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9960372100");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Khadija@123");
		
		WebElement CustGender = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		boolean result = CustGender.isDisplayed();
				
				System.out.println(result);
				
				if(result==true) {
					System.out.println("given output is true");
				}
				else {
					System.out.println("given output is not corrected");
				}
	}
	
}
	
	
