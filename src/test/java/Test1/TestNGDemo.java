package Test1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.GoogleSearchPage;

public class TestNGDemo {

	static WebDriver driver = null;

	@BeforeTest
	public void setupTest() {

		driver = new ChromeDriver();
	}

	@Test
	public static void googleSearch() {

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		GoogleSearchPage.textbox(driver).sendKeys("youtube");
		GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void testDown() {
		driver.close();
		System.out.println("Test completed sucessfully");

	}
}
