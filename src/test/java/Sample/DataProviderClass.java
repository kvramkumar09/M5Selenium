package Sample;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name= "getcredentials")
	public Object[][] getData(){
		return new Object[][] {
			{"admin", "admin"},
			{"username456@gmail.com", "username456"}
			
		};
	}
}
