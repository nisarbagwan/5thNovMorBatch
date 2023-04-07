package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Login {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();            // upcasting
driver.get("https://www.instagram.com/accounts/emailsignup/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9960372100");  //send key use for where test 

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nisar Bagwan");

driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nisarbagwan281");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Khadija@2100");

driver.findElement(By.xpath("(//div[contains(@class,'ab8w  _ab94 _ab99 _ab9f _ab9m')])[3]")).click();

driver.findElement(By.xpath("(//a[@role='link'])[9]")).click();
driver.manage().window().maximize();
	}

}
