package exercise.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import core.Base;

public class LabPracticeOne extends Base {

	/**
	 * every TC needs to have @Test annotations on top of its method
	 * 
	 * @BeforeMethod : This annotation executes block of code before each @Test
	 * @AfterMethod : This annotation executes block of code after each @Test
	 */

	@BeforeTest
	public void beforeMethod() {
		initializeDriver();
		logger.info("user navigate to Hotel Website");
	}

	@Test  (priority =1)  // (enabled = false)
	public void testOne() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Hotel']"));
		Assert.assertTrue(logo.isDisplayed());
		logger.info("logo is present");
	}
	@Test (priority = 2)//(dependsOnMethods = "testOne")   								//(invocationCount = 10)
	public void testTwo() {
		WebElement signIN = driver.findElement(By.xpath("//span[text()='Sign in']"));
		Assert.assertTrue(signIN.isDisplayed());
		signIN.click();
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement passwordField = driver.findElement(By.id("passwd"));
		WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
		Assert.assertTrue(emailField.isDisplayed());
		Assert.assertTrue(passwordField.isDisplayed());
		Assert.assertTrue(signInButton.isDisplayed());
		
	}
	
	/*
	 * lets write a test to check if Login is working?
	 */
	@Parameters({"userName","password"})
	@Test (priority = 3)
	public void loginTest(String userName, String password) {
		WebElement signIN = driver.findElement(By.xpath("//span[text()='Sign in']"));
		signIN.click();
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement passwordField = driver.findElement(By.id("passwd"));
		WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
		emailField.sendKeys(userName);
		passwordField.sendKeys(password);
		signInButton.click();
	}
	
	@AfterTest
	public void afterMethod() {
		tearDown();
	}

}
