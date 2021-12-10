package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.BaseClass;
import utility.GenericActions;

public class MastersPage extends BaseClass{
	public WebDriver driver;
	
	public MastersPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy (xpath = "//input[@placeholder ='Select Country']")
	public WebElement Country;
	
	@FindBy (xpath = "//input[@placeholder ='Select Major']")
	public WebElement Major;
	
	@FindBy (linkText ="Next")
	public WebElement Next;
	
	public void selectCountry()
	{
		GenericActions.select(Country,"United Kingdom");
		
	}
	    
	public void clickEnterMajor()
	{		
		GenericActions.enter(Major, "MBA" + Keys.ENTER);
		GenericActions.click(Major);
	}
	    
	public void clickNext()
	{
		GenericActions.click(Next);
	}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	

}
