package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.amazonSearchPageObjects;

public class TestNG_AmazonSearch {

	private static WebDriver driver = null;
	 
	 @Parameters("browserName")
	 @BeforeTest
	 
	
	public void setUpTest(String browserName) {
		 
		System.out.println("Browser name is "+ browserName);
		 
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
		   
		   WebDriverManager.iedriver().setup();
		   driver = new InternetExplorerDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		   
			WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
		}
	}
	
	@Test
	public static void amazonSearchTest() {
		
		
		   amazonSearchPageObjects object1 = new amazonSearchPageObjects(driver);
		   
		   driver.get("http://www.amazon.com");
		   //open amazon home page
		   driver.manage().window().maximize();
		   //maximize screen
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   
		   object1.setSearchTextbox("When I Was You");
		   object1.clickSearchButton();
		   object1.searchResultItem();
		   object1.clickAddButton();
		   //object1.clickPaymentButton();
		   
		
		
	}
	
	@AfterTest
	
public void endUpTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
		PropertiesFile.setProperties();
		
	}

}
