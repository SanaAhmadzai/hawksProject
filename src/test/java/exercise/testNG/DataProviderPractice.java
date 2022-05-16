package exercise.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.Base;
import utilities.ExcelUtility;

public class DataProviderPractice extends Base {
	
	@BeforeMethod
	public void beforeMethod() {
		initializeDriver();
	}
	
	@Test(dataProvider = "loginData")
	public void dataDrivenTesting(String userName, String password) {
		WebElement signIN = driver.findElement(By.xpath("//span[text()='Sign in']"));
		signIN.click();
		WebElement emailField = driver.findElement(By.id("email"));
		WebElement passwordField = driver.findElement(By.id("passwd"));
		WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
		emailField.sendKeys(userName);
		passwordField.sendKeys(password);
		signInButton.click();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='My account']")).isDisplayed());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@DataProvider(name="loginData")
	public Object[][] dataProvider(){
		Object[][] data = ExcelUtility.getExcelData("info");
		return data;
	}
	
	@AfterMethod
	public void afterMethod() {
		tearDown();
	}

}
