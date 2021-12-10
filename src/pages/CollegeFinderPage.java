package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.BaseClass;
import utility.GenericActions;

public class CollegeFinderPage extends BaseClass {
	public WebDriver driver;
	
    public CollegeFinderPage(WebDriver driver)

{
	this.driver = driver;
}
    
    
    @FindBy (linkText = "Master")
    public WebElement Master;
    
    
    @FindBy (linkText = "Bachelors")
    public WebElement Bachelors;
    
    
    
    public void clickMaster()
    {
    	GenericActions.click(Master);
    }
    
    
    public void clickBachelors()
    {
    	GenericActions.click(Bachelors);
    }
    


}
	
	
	


