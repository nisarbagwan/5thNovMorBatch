package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath="//span[@class='_wozql4 _13hnk7qk']") 
	private WebElement NameTab;
	
	@FindBy(xpath="//span[text()='Log out']") 
	private WebElement LogOut;
	
	public Logout (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void nisarbagwanTab () {
		NameTab.click();
	}
	
	public void logout () {
		LogOut.click();
	}
	
	
	
	
	
	
}
