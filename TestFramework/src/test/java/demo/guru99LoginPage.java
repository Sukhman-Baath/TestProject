package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.amazonSearchPageObjects;
import pages.guru99LoginPageObjects;

public class guru99LoginPage {

	
	private static WebDriver driver = null;
	
	
	 
	 @BeforeTest
	 public void setUpTest() {
		 
		
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		  
		  
		
	}
	
	@Test(priority = -2)
	public void loginTest() {
		
		   
		   guru99LoginPageObjects object1 = new guru99LoginPageObjects(driver);
		   driver.get("http://www.demo.guru99.com/V4/index.php");
		   //open guru99 home page
		   driver.manage().window().maximize();
		   //maximize screen
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   
		   object1.setuserTextbox("mngr242831");
		   object1.setpassTextbox("uhUdYqA");
		   object1.clickloginButton();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test()
	public void resetTest() {
		
		
		   guru99LoginPageObjects object1 = new guru99LoginPageObjects(driver);
		   driver.get("http://www.demo.guru99.com/V4/index.php");
		   //open guru99 home page
		   driver.manage().window().maximize();
		   //maximize screen
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   
		   object1.setuserTextbox("mngr242831");
		   object1.setpassTextbox("uhUdYqA");
		   object1.clickresetButton();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void blankLoginTest() {
		
		
		   guru99LoginPageObjects object1 = new guru99LoginPageObjects(driver);
		   driver.get("http://www.demo.guru99.com/V4/index.php");
		   //open guru99 home page
		   driver.manage().window().maximize();
		   //maximize screen
		   
		   
		   object1.setuserTextbox("");
		   object1.setpassTextbox("");
		   object1.clickloginButton();
		   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   Alert alert = driver.switchTo().alert();
		   alert.accept();
		
	}
	
	@Test
	public void invalidLoginTest() {
		
		
		   guru99LoginPageObjects object1 = new guru99LoginPageObjects(driver);
		   driver.get("http://www.demo.guru99.com/V4/index.php");
		   //open guru99 home page
		   driver.manage().window().maximize();
		   //maximize screen
		   
		   
		   
		   object1.setuserTextbox("ngr242831");
		   object1.setpassTextbox("hUdYqA");
		   object1.clickloginButton();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   Alert alert = driver.switchTo().alert();
		   alert.accept();
		  
		   
		
	
		
	}
	
	@Test
	public void invalidresetTest() {
		
		
		   guru99LoginPageObjects object1 = new guru99LoginPageObjects(driver);
		   driver.get("http://www.demo.guru99.com/V4/index.php");
		   //open guru99 home page
		   driver.manage().window().maximize();
		   //maximize screen
		   
		   
		   
		   object1.setuserTextbox("ngr242831");
		   object1.setpassTextbox("hUdYqA");
		   object1.clickresetButton();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   Alert alert = driver.switchTo().alert();
		   alert.accept();
		   driver.get("http://www.demo.guru99.com/V4/index.php");
		   
		
		
	}
	
	
	
	@Test
	public void invalidpasswordTest() {
		
		
		   guru99LoginPageObjects object1 = new guru99LoginPageObjects(driver);
		   driver.get("http://www.demo.guru99.com/V4/index.php");
		   //open guru99 home page
		   driver.manage().window().maximize();
		   //maximize screen
		   
		   
		   object1.setuserTextbox("mngr242831");
		   object1.setpassTextbox("hUdYqA");
		   object1.clickloginButton();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   Alert alert = driver.switchTo().alert();
		   alert.accept();
		
	}
	
	
	
	@Test
	public void invaliduserTest() {
		
		
		   guru99LoginPageObjects object1 = new guru99LoginPageObjects(driver);
		   driver.get("http://www.demo.guru99.com/V4/index.php");
		   //open guru99 home page
		   driver.manage().window().maximize();
		   //maximize screen
		   
		   
		   
		   object1.setuserTextbox("ngr242831");
		   object1.setpassTextbox("uhUdYqA");
		   object1.clickloginButton();
		   
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   Alert alert = driver.switchTo().alert();
		   alert.accept();
		
	}

	

	
	
	@AfterSuite
	
public void endUpTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
		
		
	}

}
