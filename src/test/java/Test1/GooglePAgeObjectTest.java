package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.GooglePageObject;

public class GooglePAgeObjectTest {

	static WebDriver driver = null;

	public static void googleSearchtest() {

		driver = new ChromeDriver();

		GooglePageObject pageobj = new GooglePageObject(driver); // created object for GPO class
		driver.get("https://www.google.com");
		pageobj.textSearchBox("A B C D"); // calling functions/methods in GooglePageObject
		pageobj.searchButton();
		driver.close();
	}

	public static void main(String[] args) {

		googleSearchtest();
	}

}
