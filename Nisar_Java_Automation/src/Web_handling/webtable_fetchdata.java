package Web_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_fetchdata {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		
		List<WebElement> noOfRow = driver.findElements(By.xpath("//table[@cellspacing='1']//tr"));
		for (int i=1; i<=noOfRow.size();i++) { // for loop for row
		List<WebElement> noOfCell = driver.findElements(By.xpath("//table[@cellspacing='1']//tr["+i+"]//td"));
		for (int j=0; j<=noOfCell.size();j++) {  // for loop for cell/coloumn dt
			System.out.print(noOfCell.get(j).getText()+"  ");
		}
		
		System.out.println();
		}
		
	//	option method 2 from abhi
		
//		noOfRow.size();
//
//	for (WebElement opt : noOfRow) {
//		String value = opt.getText();
//    System.out.println(value);
//	}
	}
}
//table[@cellspacing='1']