package Pop_Op;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chiled_BSW2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> tab = driver.getWindowHandles();
		ArrayList<String> text= new ArrayList(tab);
		
		String tab1 = text.get(1);
		driver.switchTo().window(tab1);
		
		WebElement aboutme = driver.findElement(By.xpath("(//span[text()='About me'])[4]"));
		aboutme.click();
		
		
		driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/li[4]/a/span/span")).click();
		 
		 driver.switchTo().window(tab1);
	}

}
