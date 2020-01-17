
package demo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.amazonSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserTest {

	private static WebDriver driver = null;

public static void invokeBrowser()
{

	   //System.setProperty("webdriver.chrome.driver", "C:/Users/shyna/git/TestProject/TestFramework/drivers/chromeDriver/chromedriver.exe");
	   //driver = new ChromeDriver();
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   
	   driver.get("http://www.amazon.com");
	   //open amazon home page
	   driver.manage().window().maximize();
	   //maximize screen
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   
	   amazonSearchPage.textboxSearch(driver).sendKeys("iphone 11 pro max");
	   //find search textbox and search the data
	   amazonSearchPage.searchButton(driver).click();
	   //find search button and click it
	   amazonSearchPage.searchResult(driver).get(0).click();
	   //get the first item in list
	   amazonSearchPage.addCart(driver).click();
	   //add that item to cart
	   amazonSearchPage.paymentButton(driver).click();
	
     
}

	public static void main(String[] args) 
	{
		invokeBrowser();
	}
}

