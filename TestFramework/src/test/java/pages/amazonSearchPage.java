package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonSearchPage {
	
	private static WebElement element=null;
	
	
	public static WebElement textboxSearch(WebDriver driver) {
	  element = driver.findElement(By.id("twotabsearchtextbox"));
	     return element;  
		}
	
	public static WebElement searchButton(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
		  return element;  
			}

	public static List<WebElement> searchResult(WebDriver driver) {
		List<WebElement> element = driver.findElements(By.xpath("//span[@class='a-truncate-cut'][contains(text(),'When I Was You')]")); 
				
	    return element;  
			}

	
	
	public static WebElement addCart(WebDriver driver) {
		 element = driver.findElement(By.id("submit.preorder"));
	    return element;  
			}
	
	public static WebElement paymentButton(WebDriver driver) {
		 element = driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']"));
	    return element;  
			}
	
}


 