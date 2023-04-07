package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Nisar");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bagwan");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9960372100");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Khadija@123");
		
		WebElement date_of_birth = driver.findElement(By.xpath("//select[@title='Day']"));
		
		date_of_birth.sendKeys("7");
		
		
		
		WebElement Male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	
		Male.click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		boolean Result = Male.isSelected();
		System.out.println(Result);
		
		if(Result==true) {
			System.out.println("Given elements is selected");
		}
		else {
			System.out.println("elements is not selected");
		}
	}

}
