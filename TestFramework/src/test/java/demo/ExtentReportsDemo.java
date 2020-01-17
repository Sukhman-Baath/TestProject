package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.amazonSearchPage;

public class ExtentReportsDemo {

	private static WebDriver driver = null; 
	public static void main(String[] args) {
	
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		ExtentTest test1 = extent.createTest("Amazon Search Test");
		
			
		// description
		extent.createTest("Amazon Search Test", "This is to test validate amazon product search functionality").pass("details");
		
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();

			test1.log(Status.INFO, "Starting Test Case");	   
			
		   driver.get("http://www.amazon.com");
		   //open amazon home page
		   driver.manage().window().maximize();
		   //maximize screen
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   
		  
		   
		   amazonSearchPage.textboxSearch(driver).sendKeys("Apple iphone 11 pro max midnight green");
		   //find search textbox and search the data
		   test1.pass("find search textbox and search the data");
		   amazonSearchPage.searchButton(driver).click();
		   //find search button and click it
		   test1.pass("find search button and click it");
		   //amazonSearchPage.searchResult(driver).get(0).click();
		   //get the first item in list
		   //test1.pass("get the first item in list");
		   //amazonSearchPage.addCart(driver).click();
		   //add that item to cart
		   //test1.pass("add that item to cart");
		   //amazonSearchPage.paymentButton(driver).click();
		    
		   
		   
	driver.close();
	driver.quit();
	test1.pass("closed the browser");
	  test1.info("Test completed");
	  extent.flush();
	
	
	
	}

}
