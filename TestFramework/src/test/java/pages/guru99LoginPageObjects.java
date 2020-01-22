package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class guru99LoginPageObjects {

	
WebDriver driver = null;
	
	By userTextbox = By.xpath("//input[@name='uid']");
	By passTextbox = By.xpath(" //input[@name='password']");
	By loginButton = By.xpath("//input[@name='btnLogin']");
	By resetButton = By.xpath("//input[@name='btnReset']");
	
	
	public guru99LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void  setuserTextbox(String text) {
		  driver.findElement(userTextbox).sendKeys(text);
			}
	
	public void  setpassTextbox(String text) {
		  driver.findElement(passTextbox).sendKeys(text);
			}
	
	public void  clickloginButton() {
		  driver.findElement(loginButton).click();
			}
	
	public void  clickresetButton() {
		  driver.findElement(resetButton).click();
			}
}
