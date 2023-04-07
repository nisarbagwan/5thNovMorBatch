package Education;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import Utility.Utility;

public class Khan_Validation  {
	WebDriver driver;
	Add_Teacher teacher;
	Login login;
	Logout logout;
	ChromeOptions options;
	 Profile profile;
	
	@BeforeClass
	public void beforeclass () {
		//System.setProperty("webdriver.chrome.driver", "\"C:\\JAR FILES\\chrome driver\\chromedriver.exe\"");
		 options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.khanacademy.org/");
	}
	
	@BeforeMethod
	public void beforemethod() {
	    login = new Login (driver);
		login.loginLink();
		login.userName();
	    login.passWord();
	    login.loginButton();
	    }
	
	@Test 
	public void verify_to_teacher_page() {
	
		 teacher = new Add_Teacher(driver);
	teacher.teachertab();
	teacher.entercode();
	teacher.spaceentercode();
	teacher.cont();
	teacher.back();
	teacher.Spacebar();
	teacher.AddCoach();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertEquals(url, "https://www.khanacademy.org/profile/me/teachers");  //validation actual result and expected result
	
	}
	
	@Test  (invocationCount=2)  // 2 time he test run hoil.
	public void to_verify_profile_page( ) {
		 profile = new Profile (driver);
	     profile.profile();
	     profile.discusTab();
		 profile.backProfile();
	String Url =driver.getCurrentUrl();
		System.out.println(Url);
		Assert.assertEquals(Url, "https://www.khanacademy.org/profile/kaid_8225029506848710018504677");
		//Assert.fail();  // test case fail krnyasathi used krto
	}
	
	@Test //(timeOut=3000)
	public void Logout () {
		Logout Logout = new Logout(driver) ;
			logout.nisarbagwanTab();
			logout.logout();
			 String url2 =driver.getCurrentUrl();
			System.out.println(url2);
			Assert.assertEquals(url2, "https://www.khanacademy.org/logout");
			}
		
	
	
	
	@AfterMethod
	public void aftermethod (TestResult result) throws IOException {
	    logout = new Logout(driver);
		logout.nisarbagwanTab();
		logout.logout();
		
		if(TestResult.SKIP==result.getStatus()) {
			Utility.Fail_Screenshot(driver);
		}
	}
	@AfterClass
	public void afterclass ()  {
		driver.close();
	}
}		
		
		
	
	

