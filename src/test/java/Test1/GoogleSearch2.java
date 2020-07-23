package Test1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.GoogleSearchPage;

public class GoogleSearch2 {

	static WebDriver driver = null;
	public static void googleSearch() {

		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		  
		 GoogleSearchPage.textbox(driver).sendKeys("youtube");
		 GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);
		 driver.close();
		System.out.println("Test completed sucessfully");

	}

	public static void main(String[] args) {
		googleSearch();
	}
}
