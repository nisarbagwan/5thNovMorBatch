package Pop_Op;

import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class chiled_Window {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/"); ////main windows open here
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();  //1st Tab  

		Set<String> path= driver.getWindowHandles(); //{ all new chiled window path are stored in 'path'
		                                                   // in which path are stored in unsequance }
		
	    ArrayList<String> id =new ArrayList<String>(path); //{sequance ne honayasathi ani index prmane yenesathi aapn path ha 'id' 
	                                                       //ya vairable madhe store kel n te 'id'ArrayList<String> mahey variable madhey yeto}
	    
	    String cwad= id.get(1);// child browser adress stored hoto 'cwad'
	    
	    driver.switchTo().window(cwad);  // selenium cha focus main page to chiled vr gheun jatao
	    
	    String Title = driver.getTitle();   // main page chi url milal pahije
	    System.out.println("home page url" +Title);
	    
	    String Curl = driver.getCurrentUrl();   // {chiled page chi url milali pahije after that selenium focus change 
	                                               //from main page to chiled page}
	    System.out.println("current page url"+Curl);
	    
	    // i want to opem new window so i want to open 'about me' tab 2nd Tab open
	    driver.findElement(By.xpath("(//span[text()='About me'])[4]")).click();	
	     
	    String Title1 = driver.getCurrentUrl();   
	    System.out.println("current page url" +Title1);
	    
	    driver.switchTo().window(cwad); 
	 // then i want to open new 'Tranning' tab '3rd' which open in same windows near parents window
	    driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	    
	    WebDriver tab = driver.switchTo().newWindow(WindowType.TAB);// new window tab open hoil 4th one
	    tab.get("https://www.facebook.com/");
	    
	    String Title2 = driver.getCurrentUrl();  
	    System.out.println("current page url" +Title2);
	    
	    driver.switchTo().window(id.get(0));  // switch focus  to main browser window
		Thread.sleep(2000);
		
		String Title3 = driver.getCurrentUrl();   // main page chi url milal pahije
	    System.out.println("current page url" +Title3);
	    
	    driver.switchTo().window(cwad);
	    driver.switchTo().newWindow(WindowType.WINDOW).switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.w3schools.com/");
	   //driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	    String Title4 = driver.getCurrentUrl();  
	    System.out.println("current page url" +Title4);
	    
	}

}
