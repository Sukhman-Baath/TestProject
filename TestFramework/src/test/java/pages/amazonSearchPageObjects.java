package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class amazonSearchPageObjects {

	WebDriver driver = null;
	
	By textboxsearch = By.id("twotabsearchtextbox");
	By searchButton = By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
	By searchResult = By.xpath("//span[contains(text(),'Apple iPhone 11 Pro Max, 256GB, Midnight Green, Fu')]");
	By addCart = By.id("add-to-cart-button");
	By paymentButton = By.xpath("//a[@id='hlb-ptc-btn-native']");
	
	public amazonSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void  setSearchTextbox(String text) {
		  driver.findElement(textboxsearch).sendKeys("iphone 11 pro max");
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
	
	public void  clickPaymentButton() {
		  driver.findElement(paymentButton).click();
			}
	
		
}


