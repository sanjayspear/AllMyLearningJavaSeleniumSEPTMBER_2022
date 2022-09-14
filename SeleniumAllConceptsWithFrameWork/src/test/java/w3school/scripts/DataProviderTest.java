package w3school.scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name = "Authentication")

	public static Object[][] credentials() {

		// The number of times data is repeated, test will be executed the same no. of
		// times

		// Here it will execute two times

		return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@456" } };

	}

	// Here we are calling the Data Provider object with its Name

	@Test(dataProvider = "Authentication")

	public void test1(String un, String pwd) {
        System.out.println(un+" "+pwd);
	}
	
}
