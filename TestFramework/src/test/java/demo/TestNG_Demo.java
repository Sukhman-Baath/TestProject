package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.amazonSearchPageObjects;

public class TestNG_Demo {

	 private static WebDriver driver = null;
	 
	 
	 @BeforeTest
	 
	 
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		
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
		   
		   object1.setSearchTextbox("iphone 11 pro max");
		   object1.clickSearchButton();
		   object1.searchResultItem();
		   object1.clickAddButton();
		   object1.clickPaymentButton();
		   
		
		
	}
	@AfterTest
public void endUpTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
		
	}

}
