package Scrooll_up_down_left_right;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_up_down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//
		JavascriptExecutor scroll= (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBY(0,500)");  //SCROLL UP
		Thread.sleep(4500);
        scroll.executeScript("window.scrollBY(0,-900)");
        Thread.sleep(4500);
        scroll.executeScript("window.scrollBY(700,0)", " ");
        Thread.sleep(4500);
        scroll.executeScript("window.scrollBY(-1000,0)", " ");
        Thread.sleep(4500);
	}

}
