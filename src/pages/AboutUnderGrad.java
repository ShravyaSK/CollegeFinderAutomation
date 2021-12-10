package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.GenericActions;

public class AboutUnderGrad {
	
	
	@FindBy (xpath = "//input[@placeholder ='Select College']")
	public WebElement College;
	
	@FindBy (xpath = "//input[@placeholder ='Select Major']")
	public WebElement Major;
	
	@FindBy (id ="marks")
	public WebElement Marks;
	
	@FindBy (linkText ="Next")
	public WebElement Next;
	
	public void enterCollege() {
		GenericActions.enter(College, "St Joseph Engineering College" +Keys.ENTER);
		
	}
	
	public void enterMajor() {
		GenericActions.enter(Major, "Electronics and Communication" +Keys.ENTER);
		
	}
	
	public void enterMarks() {
		GenericActions.enter(Marks, "8.4" +Keys.ENTER);
		
	}
	
	
	

}
