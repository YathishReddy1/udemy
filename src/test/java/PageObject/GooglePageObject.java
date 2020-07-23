package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePageObject {

	WebDriver driver;

	By textbox_Search = By.id("lst-ib"); // we can locate objects like this
	By button_Srarch = By.name("btnK");

	public GooglePageObject(WebDriver driver) {
		
		this.driver = driver;
	}
	public void textSearchBox(String text) {

		driver.findElement(textbox_Search).sendKeys(text); // these are the actions of the above objects

	}

	public void searchButton() {

		driver.findElement(button_Srarch).sendKeys(Keys.RETURN);
	}
}
