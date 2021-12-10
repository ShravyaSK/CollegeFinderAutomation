package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver;
	public static FluentWait<WebDriver> fluentwait;
	
	@BeforeSuite
	public void init()
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(utility.Contants.test_URL);
		
	}
	
	@AfterSuite
	public void close() {
		driver.close();
	}
	
}
