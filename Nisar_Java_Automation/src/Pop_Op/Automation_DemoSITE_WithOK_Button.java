package Pop_Op;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_DemoSITE_WithOK_Button {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver ();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			//driver.findElement(By.xpath("//button[@class='btn btn-success navbar-toggle']")).click();
			
			//driver.findElement(By.className("dropdown-toggle")).click();
			
			//driver.findElement(By.xpath("//a[@href='Alerts.html']")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			
			Alert alt = driver.switchTo().alert();
			//String altmsg = driver.switchTo().alert().getText();
			//System.out.println(altmsg);
			Thread.sleep(5000);
			alt.accept();
			
			//alt.dismiss();
			
			
	}

}
