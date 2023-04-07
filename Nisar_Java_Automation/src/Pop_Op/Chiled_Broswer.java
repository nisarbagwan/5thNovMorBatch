package Pop_Op;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class Chiled_Broswer {

	public static void main(String[] args) throws Exception {
		
        WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();  // xpath 1 tab 
		
		java.util.Set<String> id = driver.getWindowHandles();   //all windos path are stored in 'id'
		
		ArrayList<String> al = new ArrayList<String>(id);     // all path are geting from index
		
		String cbadd = al.get(1);// child browser adress
		
		driver.switchTo().window(cbadd);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		driver.switchTo().window(al.get(1));  // switch to main browser window
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='About me'])[4]")).click();  // second tab is open by using this above x path..
		

	}

}
