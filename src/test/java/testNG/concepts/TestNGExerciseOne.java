package testNG.concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGExerciseOne {
	
	@Test
	public void whiteColor() {
		
	}
	@Test (invocationCount = 10)
	public void blackColor() {
		
	}
	@Test
	public void redColor() {
		
	}
	@Ignore
	@Test
	public void yellowColor() {
		
	}
	
	@Test @Ignore
	public void greenColor() {
		
	}
	@Test @Ignore
	public void pinkColor() {
		
	}
	@Test
	public void goldColor() {
		
	}
	@Test
	public void silverColor() {
		
	}
	@Test
	public void brownColor() {
		
	}
	
	@Test
	public void TurquoiseColor() {
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hello this is before Color Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Bye bye this is after Color Test");
	}
	

}
