package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Demo_Site_login {
public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Nisar");  // name
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bagwan");  //lastname
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Kakratale mohallaha mahad raigad 402301");  //address
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nisarbagwan2100@gmail.com");  //emails id
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9960372100");  // phone number
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		male.click();
		boolean result = male.isSelected();                   //gender take male
		System.out.println(result);
		if (result==true) {
			System.out.println("butten is selected");
		}
		else {
			System.out.println("butten is not selected");
		}
		
      WebElement hobbies = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
      hobbies.click();
      boolean result2 = hobbies.isSelected();
     System.out.println(result2);
      if (result2==true) {
    	  System.out.println("given tab is selected");
      }
      else {
    	  System.out.println("given tab is not selected");
      }
      WebElement year = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
      Select se = new Select (year);
      se.selectByValue("1994");
      WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
        Select ss = new Select (month);
      //ss.selectByVisibleText("August");
        ss.selectByIndex(7);
      WebElement day = driver.findElement(By.id("daybox"));
      Select sd = new Select (day);
      sd.selectByValue("8");
      
     WebElement skill = driver.findElement(By.id("Skills"));
     Select s1 = new Select(skill);
     s1.selectByVisibleText("Android");
//     WebElement country = driver.findElement(By.id("countries"));
//     Select S2 = new Select (country);
//     S2.selectByVisibleText("India");
}
}
