package Permission_Broswer_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Permission_irctc__popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//ChromeOptions option = new ChromeOptions();
        options.addArguments("--disable-notifications");
       // WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // driver.get("https://www.irctc.co.in/nget/profile/user-registration");
        driver.navigate().to("https://www.irctc.co.in/nget/profile/user-registration");
       String text = driver.getTitle();
       System.out.println(text);
       String curl = driver.getCurrentUrl();
       System.out.println(curl);
       
        driver.findElement(By.id("disha-banner-close")).click();
        driver.findElement(By.id("userName")).sendKeys("NisarpBagwan2100");
        driver.findElement(By.id("usrPwd")).sendKeys("Khadija@2100");
        driver.findElement(By.id("cnfUsrPwd")).sendKeys("Khadija@2100");
        
        // to add langauge from dropdown
        WebElement ql = driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-7 ui-dropdown ')]"));
        Actions act = new Actions (driver);
        act.click(ql).build().perform();
        WebElement lang = driver.findElement(By.xpath("//li[@aria-label='English']"));
       act.click(lang).build().perform();
       
       // to add answer from dropdwon from input
       WebElement src = driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-8 ui-dropdown ui')]"));
       act.click(src).build().perform();
       WebElement ch = driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[3]"));
      act.click(ch).perform();
       driver.findElement(By.xpath("//input[@placeholder='Security Answer']")).sendKeys("salamn khan");
       driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
 
       //next page 2
       
       driver.findElement(By.id("firstName")).sendKeys("Nisar piran Bagwan");
       driver.findElement(By.id("middleName")).sendKeys("piran");
       driver.findElement(By.id("lastname")).sendKeys("Bagwan");
       
        
        
	}
	
}
