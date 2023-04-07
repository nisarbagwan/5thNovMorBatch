package Permission_Broswer_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Broswer_PopUp {

	public static void main(String[] args) {
		ChromeOptions  option = new ChromeOptions();  
		ChromeOptions wrk = option.addArguments("disabled-notification"); 
		String txt = wrk.getBrowserName();
		System.out.println(txt);
		
		WebDriver driver= new ChromeDriver(option);
                  driver.get("https://admin-demo.nopcommerce.com/admin/");
                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                  driver.findElement(By.id("Email")).clear();
                  driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
                  driver.findElement(By.name("Password")).clear();
                  driver.findElement(By.name("Password")).sendKeys("admin");
                  driver.findElement(By.id("RememberMe")).click();
                  driver.findElement(By.xpath("//button[@type='submit']")).click();
                  
	
	}
}
