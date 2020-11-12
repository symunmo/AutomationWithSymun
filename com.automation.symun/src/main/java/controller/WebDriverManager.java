package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverManager {
	public WebDriver driver=null;
	private Browsers DriverManager;
	
	public void setWebDriver(String platform) {
		DriverManager = new Browsers(platform);
	}
	
	public void openBrowser(String mode) {
		DriverManager.openBrowser(mode);
		this.driver= DriverManager.getDriver();
	}
	
	public void goTo(String url) {
		this.driver.get(url);
	}
	
	public void closeBrowser() {
		this.driver.quit();
	}
	
	public void closeCurrentTab(){
		this.driver.close();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
		return this.driver.getCurrentUrl();
	}
	
	public String getPageSource() {
		return this.driver.getPageSource();
	}
	
	public WebElement findElement(String locator, String locatorType) {
		WebElement element =null;
		switch(locatorType.toLowerCase()) {
		case "id":
			element = driver.findElement(By.id(locator));
			break;
		case "name":
			element = driver.findElement(By.name(locator));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(locator));
			break;
		case "class":
			element = driver.findElement(By.className(locator));
			break;
		case "text":
			element = driver.findElement(By.linkText(locator));
			break;
		case "partialtext":
			element = driver.findElement(By.partialLinkText(locator));
			break;
		}
		return element;
	}
}
