package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
public static void main (String [] args) throws InterruptedException {
//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");        // new version madhey set,property use nhi krt aapn direct lihu shkto
WebDriver driver=new ChromeDriver();

driver.get("https://www.flipkart.com");               //open 1 window of chrome and facebook web page 
Thread.sleep(2000);
driver.switchTo().newWindow(WindowType.TAB);          // open new tab in same window of chrome browsers
driver.get("https://www.google.com");                 // open google website into new tab
Thread.sleep(2000);
driver.switchTo().newWindow(WindowType.WINDOW);        // OPEN 2 window of the chorme browser
driver.get("https://www.gmail.com");                   // open gmail website into new tab in same window
String title=driver.getTitle();
System.out.println(title);
String exptitle= driver.getTitle();   //upcasting expected results=actual results
if (title.equalsIgnoreCase(exptitle)) {
	System.out.println("navigate to correct page");
}
else {
	System.out.println("navigate to invalid page");
}
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().back();
driver.manage().window().maximize();
Thread.sleep(6000);
driver.manage().window().minimize();
Thread.sleep(5000);

driver.close();
driver.quit();
}
}
