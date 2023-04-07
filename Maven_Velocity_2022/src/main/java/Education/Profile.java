package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {

	@FindBy(xpath="//span[text()='Profile']") 
	private WebElement Pofile;
	
	@FindBy(xpath="(//a[@class='_1g8isxy8 profile-widget-view-all'])[3]") 
	private WebElement DiscussionTab;
	

	@FindBy(xpath="(//a[@class='_1g8isxy8'])[1]") 
	private WebElement BackProfile;
	
	//constructor call kel
	public Profile (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//method call krnar
		public void profile() {
			Pofile.click(); 
		 }

		public void discusTab() {
			DiscussionTab.click(); 
		 }
	
		public void backProfile() {
			BackProfile.click(); 
		 }
}
