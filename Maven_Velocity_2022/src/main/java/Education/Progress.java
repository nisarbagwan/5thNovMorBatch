package Education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Progress {

	@FindBy (xpath="//span[text()='Progress']") 
	private WebElement Progress;
	
	@FindBy (xpath="(//button[@type='button'])[2]") 
	private WebElement DayCustamized;
	
	@FindBy (xpath="(//div[@role='option'])[1]") 
	private WebElement Today;
	
	@FindBy (xpath="(//button[@type='button'])[3]") 
	private WebElement AllContent;
	
	@FindBy (xpath="(//span[text()='Course mastery goals'])[2]") 
	private WebElement Coursemastery;
	
	@FindBy (xpath="(//button[@type='button'])[4]") 
	private WebElement Activities;
	
	@FindBy (xpath="(//div[@role='option'])[1]") 
	private WebElement Escersie;
	
	public Progress (WebDriver  driver) {
		PageFactory.initElements(driver, this);
	}

	public void progress() {
		Progress.click();
	}
	
	public void dayCustamized() {
		DayCustamized.click();
	}
	
	public void today() {
		Today.click();
	}
	
	public void allContent() {
		AllContent.click();
	}
	
	public void coursemasterys() {
		Coursemastery.click();
	}
	
	public void activities() {
		Activities.click();
	}
	
	public void escersie() {
		Escersie.click();
	}
	
	
}
