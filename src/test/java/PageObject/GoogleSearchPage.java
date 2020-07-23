package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebElement element = null;    //Making class variable to reuse
	
	public static WebElement textbox(WebDriver driver) {  // we have to get instance of driver from our test
		
		 element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static WebElement buttonSearch(WebDriver driver) {
		
		element = driver.findElement(By.name("btnK"));
		return element;
	}

}
