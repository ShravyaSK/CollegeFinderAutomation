package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.BaseClass;
import utility.GenericActions;

public class HomePage extends BaseClass{
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy (linkText = "Home")
    public WebElement Home;
    
    @FindBy (linkText="Explore")
    public WebElement Explore;
    
    @FindBy (linkText = "Resources")
    public WebElement Resources;
	
	 @FindBy (id = "college-finder")
	 public WebElement CollegeFinder;	    
	    
	    
	   @FindBy (linkText="Connect")
	    public WebElement Connect;
	    
	    @FindBy (linkText = "Premium")
	    public WebElement Premium; 
	    
	   

		public void clickCollegeFinder() {
			GenericActions.click(CollegeFinder);
			
		}

}
