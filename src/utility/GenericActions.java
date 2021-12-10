package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import main.BaseClass;

public class GenericActions extends BaseClass {

	public static void click(WebElement element)
	{
		element.click();			
		Assert.fail("unable to click web element");		
	}

	
	public static void enter(WebElement element, String value)
	{
		element.clear();
		element.sendKeys(value);
		Assert.fail(value +" is not entered in the text field");
	}
	
	public static void select(WebElement element, String text)
	{
		Select dropdown = new Select (element);
		dropdown.deselectByVisibleText(text);
		Assert.fail(text +" is not selected");
	}
	
	public static void enterNumber(WebElement element, double number)
	{
		element.clear();
		element.sendKeys(number+"");
		Assert.fail(number +" is not entered in the text field");
	}
	
}
