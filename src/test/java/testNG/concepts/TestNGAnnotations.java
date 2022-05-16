package testNG.concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	// if a method has @Test on top of it it is considered as one Test Case
	// @Test in TestNG equals to one Scenario in Cucumber 
	
	
	@Test (priority =3, enabled = false)
	public void testA() {
	System.out.println("======= This is test A=========");	
	}
	
	//@Ignore // this test case will be ignored at the time of execution 
	@Test (priority = 2, invocationCount = 10)
	public void testB() {
		System.out.println("======= This is test B=========");	
	}
	@Test(priority = 1)
	public void testC() {
		System.out.println("======= This is test C=========");	
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This Method runs before  each @Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This Method runs after each @Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This Method runs before first @Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This method runs after last @Test");
	}
}









