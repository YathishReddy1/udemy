package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {
	
	public static void main(String[] args) {
		
		wait1();
	}
	
	public static void wait1() {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait =  new WebDriverWait(driver,20);
		WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(By.name("abcde")));
		driver.findElement(By.name("yash")).click();
		driver.close();
		
	}

}
