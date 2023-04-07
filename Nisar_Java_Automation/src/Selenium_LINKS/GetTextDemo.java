package Selenium_LINKS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDemo {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        String FacebookText = driver
                                .findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/div/div[1]/div[1]/span")).getText();
        System.out.println("Text on Facebook Site:- " + FacebookText);
     driver.close();
  }

}

	
