package Education;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	// step 1 To declare DM (Variable) globally
	
		@FindBy(xpath="//a[@id='login-or-signup']") 
		private WebElement loginlink;
		
		@FindBy(xpath="(//input[@class='_1azps1NaN'])[1]") 
		private WebElement userName;
		
		@FindBy(xpath="//input[@type='password']") 
		private WebElement passWord;
		
		@FindBy(xpath="//button[@type='submit']") 
		private WebElement loginButton;
		
		
		// Step 2 Initialization of Variable or DM
		
		public Login(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		// step 3 Method create
		
		public void loginLink() {
			loginlink.click();
			
		}
		public void userName() {
			userName.sendKeys("nisarbagwan2100@gmail.com");
			
		}

		public void passWord() {
			passWord.sendKeys("Khadija@2100");;
			
		}

		public void loginButton() {
			loginButton.click();
}
}
