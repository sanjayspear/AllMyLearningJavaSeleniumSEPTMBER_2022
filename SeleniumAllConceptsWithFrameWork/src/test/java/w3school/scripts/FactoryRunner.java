package w3school.scripts;

import org.testng.annotations.Factory;

public class FactoryRunner {

	/*
	 * We can use @Factory to provide data to all our test cases for same or
	 * different classes all at one go. At same time @DataProvider does the same job but,
	 * there is a overhead that we need link our test cases with data provider name for all
	 * our test cases. However same is not true with the @Factory annotation. Here, we 
	 * just need to create an instance of class with arguments as test data. 
	 */
	
	@Factory
	public Object[] factory() {
		return new Object[] { new A("abc@gamil.com", "abc@123", "Valid Credentials"), 
				              new A("xyz@gmail.com", "xyz@123", "Invalid Credentials"),
				              new B("abc@gamil.com", "abc@123", "Valid Credentials"), 
				              new B("xyz@gmail.com", "xyz@123", "Invalid Credentials")
				            };
	}

}
