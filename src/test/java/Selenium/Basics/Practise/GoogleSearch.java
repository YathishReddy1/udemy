package Selenium.Basics.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void googleSearch() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("youtube");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		System.out.println("Test completed sucessfully");
		
	}
	
	public static void main(String[] args) {
		googleSearch();
	}
}
