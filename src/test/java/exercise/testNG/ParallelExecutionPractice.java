package exercise.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutionPractice {

	WebDriver driver;

	@Test
	public void testOne() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tek-school.com/hotel");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testTwo() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tek-school.com/hotel");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testThree() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testFour() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tekschool.us/");
		System.out.println(driver.getTitle());

	}

}
