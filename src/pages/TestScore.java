package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.GenericActions;

public class TestScore {
	
	@FindBy (linkText ="TOEFL")
	public WebElement TOEFL;
	
	@FindBy (linkText ="IELTS")
	public WebElement IELTS;
	
	@FindBy (id ="ielts_overall_score")
	public WebElement IELTSScore;
	
	@FindBy (linkText ="PTE")
	public WebElement PTE;
	
	@FindBy (linkText ="GRE")
	public WebElement GRE;
	
	@FindBy (linkText ="GMAT")
	public WebElement GMAT;
	
	@FindBy (id ="total_gmat_score")
	public WebElement gmatScore;
	
	@FindBy (linkText ="None")
	public WebElement None;
	
	@FindBy (linkText ="Next")
	public WebElement Next;
	
	public void clickIELTS()
	{
		GenericActions.click(IELTS);
	}
	
	public void enterIELTSscore()
	{
		GenericActions.enterNumber(IELTSScore, 8);
		
	}
	
	public void clickGMAT()
	{
		GenericActions.click(GMAT);
	}
	
	public void enterGMATscore()
	{
		GenericActions.enterNumber(gmatScore, 600);
		
	}
	
	public void clickNext()
	{
		GenericActions.click(Next);
	}
	
	

}
