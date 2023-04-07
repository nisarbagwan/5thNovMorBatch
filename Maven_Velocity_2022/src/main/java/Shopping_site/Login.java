package Shopping_site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
        @FindBy (xpath="//input[@id='user-name']") 
        private WebElement Login;
        
        @FindBy (xpath="//input[@id='password']") 
        private WebElement Password;
        
        @FindBy (xpath="//input[@id='login-button']") 
        private WebElement ButtonLogin;
        
        public void Login (WebDriver driver) {
        	PageFactory.initElements(driver ,this);
        } 
        
        public void login () {
        	Login.sendKeys("standard_user");
        }
        
        public void password () {
        	Password.sendKeys("secret_sauce");
        }
        
        public void buttonLogin () {
        	ButtonLogin.click();
        }
}    
        
        
       
