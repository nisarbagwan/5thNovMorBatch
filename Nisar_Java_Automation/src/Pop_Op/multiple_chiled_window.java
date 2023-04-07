package Pop_Op;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_chiled_window {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demoqa.com/browser-windows");
		//open new window by clicking the button
		driver.findElement(By.id("tabButton")).click();
	}

}
