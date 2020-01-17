package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class amazonSearchPageObjects {

	WebDriver driver = null;
	
	By textboxsearch = By.id("twotabsearchtextbox");
	By searchButton = By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
	By searchResult = By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'When I Was You')] ");
	By addCart = By.xpath("//input[@type='submit'][@name='submit.preorder']");
	//By paymentButton = By.xpath("//a[@id='hlb-ptc-btn-native']");
	
	public amazonSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void  setSearchTextbox(String text) {
		  driver.findElement(textboxsearch).sendKeys("When I Was You");
			}
	
	public void  clickSearchButton() {
		  driver.findElement(searchButton).click();
			}
	
	public void  searchResultItem() {
		  driver.findElement(searchResult).click();
			}
	
	public void  clickAddButton() {
		  driver.findElement(addCart).click();
			}
	
	//public void  clickPaymentButton() {
		//  driver.findElement(paymentButton).click();
			//}
	
		
}


