package Pop_Op;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver = new ChromeDriver();
	    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		driver.switchTo().alert().accept();
       
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
        driver.switchTo().alert().sendKeys("yes"); 
       
     Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
	}
}
