package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import main.BaseClass;
import pages.AboutUnderGrad;
import pages.CollegeFinderPage;
import pages.HomePage;
import pages.MastersPage;
import pages.TestScore;

public class CaseCreation extends BaseClass {
	
	static WebDriver driver;
	
	@Test
	public static void CollegeFinder() 
	{
		HomePage hp = PageFactory.initElements(driver,HomePage.class);
		CollegeFinderPage cfp = PageFactory.initElements(driver,CollegeFinderPage.class);
		MastersPage mp = PageFactory.initElements(driver,MastersPage.class);
		AboutUnderGrad aug = PageFactory.initElements(driver,AboutUnderGrad.class);
		TestScore ts = PageFactory.initElements(driver,TestScore.class);
		
		hp.clickCollegeFinder();
		
		cfp.clickMaster();
		
		mp.selectCountry();
		mp.clickEnterMajor();
		mp.clickNext();
		
		aug.enterCollege();
		aug.enterMajor();
		aug.enterMarks();
		
		ts.clickIELTS();
		ts.enterIELTSscore();
		ts.clickGMAT();
		ts.enterGMATscore();
		
		
	}



}
