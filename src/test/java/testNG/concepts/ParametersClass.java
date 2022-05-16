package testNG.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersClass {
	
	WebDriver driver;
	/**
	 * in TestNG we have two ways to parameterize our test data
	 * 1. Parameters 
	 * 2. Data Provider
	 */
	
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tek-school.com/hotel/");
		
	}
	@Parameters({"cityName"})
	@Test
	public void test(String cityName) {
		driver.findElement(By.id("hotel_location")).sendKeys(cityName);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
