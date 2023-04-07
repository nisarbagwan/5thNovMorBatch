package Education;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLogin {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "\"C:\\JAR FILES\\chrome driver\\chromedriver.exe\"");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.khanacademy.org/");
        
        Login login = new Login(driver);
        login.loginLink();
        login.userName();
        login.passWord();
        login.loginButton();
        
        Add_Teacher teacher = new Add_Teacher(driver);
        teacher.teachertab();
        teacher.entercode();
        teacher.spaceentercode();
        teacher.cont();
        teacher.back();
        teacher.Spacebar();
        teacher.AddCoach();
        
        Profile profile = new Profile(driver);
        profile.profile();
        profile.discusTab();
        profile.backProfile();
        
        Progress progress =new Progress(driver);
        progress.progress();
        progress.dayCustamized();
        progress.today();
        progress.allContent();
        progress.coursemasterys();
        progress.activities();
        progress.escersie();
        
        Logout logout = new Logout (driver);
        logout.nisarbagwanTab();
        logout.logout();
	}

}
