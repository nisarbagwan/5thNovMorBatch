package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Teacher {
            // data member are declared
	
	
	@FindBy (xpath="//span[text()='Teachers']") private WebElement TeacherTab; 
	
	@FindBy (xpath="//a[@role='button']") private WebElement ENTERCODE;
	
	@FindBy (xpath="//input[@maxlength='8']") private WebElement spaceentercode; 
	
	@FindBy (xpath="//button[@type='button']") private WebElement CONT;
	
	@FindBy (xpath="//a[@role='button']") private WebElement Back;
	
	@FindBy (xpath="//input[@id='coach-email']") private WebElement Spacebar;
	
	@FindBy (xpath="//input[@type='submit']") private WebElement AddCoach;
	
	// data member are initialized  means we can create constructor with same class name as per 3 rules 
	
	public Add_Teacher (WebDriver  driver) {
		PageFactory.initElements(driver, this);
	}
	
	// data member are in used 
	
	public void teachertab () {
		TeacherTab.click();
	}
	
	public void entercode() {
		ENTERCODE.click();
	}
	
	public void  spaceentercode () {
		spaceentercode.sendKeys("VELO0987");
	}
	
	public void cont () {
		CONT.click();
	}
	
	public void back () {
		Back.click();
	}

	public void Spacebar () {
		Spacebar.sendKeys("gadadesushma@gmail.com");
	} 
	
	public void AddCoach () {
		AddCoach.click();
	}
}
