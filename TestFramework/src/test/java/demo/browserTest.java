
package demo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserTest {

	WebDriver driver;

public void invokeBrowser()
{

	   //System.setProperty("webdriver.chrome.driver", "C:/Users/shyna/git/TestProject/TestFramework/drivers/chromeDriver/chromedriver.exe");
	   //driver = new ChromeDriver();
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("http://www.amazon.com");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
       searchTextBox.sendKeys("iphone 11 pro max");
       WebElement searchButton = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
       searchButton.click();
       
       List<WebElement> listOfResults = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 11 Pro Max, 256GB, Midnight Green, Fu')]"));
    		  
       //int count = listOfResults.size();
       //System.out.println("No. of products"+ count);
       listOfResults.get(0).click();
       WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
       addToCartButton.click();
       driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
     
    
}

	public static void main(String[] args) 
	{
		browserTest object1 = new browserTest();
     object1.invokeBrowser();
	}
}

//twotabsearchtextbox