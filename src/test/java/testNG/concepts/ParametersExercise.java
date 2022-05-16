package testNG.concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExercise {
	
	
	@Test @Parameters({"fName","lName"})
	public void test(String fName, String lName) {
		String firstName = fName;
		String lastName = lName;
		
		System.out.println(firstName);
		System.out.println(lastName);
	}

}
