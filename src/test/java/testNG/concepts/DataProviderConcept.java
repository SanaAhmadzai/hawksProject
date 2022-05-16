package testNG.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class DataProviderConcept {

	@Test(dataProvider = "informationInput")
	public void printTestData(String email, String pass) {

		System.out.println("This is email value " + email);
		System.out.println("This is password value " + pass);

	}

	@DataProvider(name ="informationInput")
	public Object[][] getData(){
		
		Object[][] data = ExcelUtility.getExcelData("info");
		return data;
		
		
	}
}
