package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class MultiBrowser {

	WebDriver driver;

	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser name is :" + browserName);
		System.out.println("Thread id is :"+Thread.currentThread().getId()
				);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			  driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(3000);

	}
	
	@AfterTest
	public void close() {
		
		driver.close();
		System.out.println("Test completed sucessfully");
	}

}
