package Web_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_Table {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.manage().window().maximize();

    	List<WebElement> NoOfRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
     System.out.println(NoOfRow.size());
      
     int i=0;
	List<WebElement> NoOfcell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td)"));
      System.out.println(NoOfcell.size());
	
	}
	}

