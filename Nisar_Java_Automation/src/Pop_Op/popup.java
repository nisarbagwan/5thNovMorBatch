package Pop_Op;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver ();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.className("analystic")).click();
            driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			 Alert alt = driver.switchTo().alert();
			alt.accept();
			
			driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
			

			driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Alert alt2 = driver.switchTo().alert();
			
			Thread.sleep(2000);
			driver.switchTo().alert().sendKeys("it is good");  // =====> 1
			//driver.switchTo().alert().accept();
			alt2.accept();
			//alt.dismiss();
	 }		
	}
//	driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
//    driver.switchTo().alert().sendKeys("yes");  // =====> 1
//    driver.switchTo().alert().accept();

