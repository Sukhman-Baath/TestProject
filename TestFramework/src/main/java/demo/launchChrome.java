package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/shyna/Downloads/chromedriver.exe");      
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		

	}

}
