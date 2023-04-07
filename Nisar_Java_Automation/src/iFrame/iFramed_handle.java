package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iFramed_handle {

	public static void main(String[] args) {
		//System.setProperty("WebDriver.Chrome.driver", "C:\\JAR FILES\\chrome driver\\chromedriver_win32.zip.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
        //WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
        driver.switchTo().frame(iframe);
		WebElement frame = driver.findElement(By.xpath("//button[@type='button']"));
		frame.click();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='tryhome']"));
		
		driver.switchTo().defaultContent();
		
	}

}
