package Pop_Op;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_alert_popup {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver = new ChromeDriver ();

	driver.get(" https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("996552");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Alert alt = driver.switchTo().alert();
	
	String text1 = driver.switchTo().alert().getText();
	System.out.println(text1);
	
	alt.accept();
	
	
}
}