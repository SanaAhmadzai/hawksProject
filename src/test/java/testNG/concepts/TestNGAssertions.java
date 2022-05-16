package testNG.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {

	/*
	 * In TestNG we have two types of assertions Hard Assert and Soft Assert.
	 *  Hard Assert: if the assertion fails the flow of execution stops right away
	 *  Soft Assert: if the assertion fails the flow of execution will not stop and
	 * continue to next line of code, but the test case will be marked as filed at
	 * the of execution
	 * 
	 * Note: JUnit doens't have soft assertion, but TestNg has.
	 * 
	 * Note: The practical usage, is that when we test the application & we want to test not too important
	 * functionality of the application but just want to check if the functions
	 * are present, then we use soft Assertion.
	 * 
	 */
	
	
	@Test
	public void hardAssert() {
		int a = 10;
		int b = 20;
		System.out.println("this is before assertion");
		Assert.assertEquals(a, b);
		System.out.println("this is after assertion");

	}
	@Test
	public void softAssert() {
		SoftAssert softAssert = new SoftAssert(); // soft assert will fail the flow of execution but wont stop. 
		System.out.println("before soft assert"); // suppose logo is not present, so we will not stop for logo. but will move to next step. and at  the end we will check this.
		softAssert.assertTrue(false);
		System.out.println("after soft assert one");
		softAssert.assertEquals(10,50);
		System.out.println("after soft assert two");
		softAssert.assertTrue(true);
		System.out.println("after soft assert three");
		softAssert.assertAll(); // it will tell if the testcase pass or fail. if we don't use this, it wont check the assertions.
	}

}
