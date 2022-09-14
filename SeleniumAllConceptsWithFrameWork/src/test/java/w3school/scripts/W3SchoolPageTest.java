package w3school.scripts;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjectsmislionious.W3CHomepage;

@Listeners(resources.Listeners.class)

public class W3SchoolPageTest extends Hooks {

	public W3SchoolPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void w3schoolDynamicWebTableTest() throws IOException, InterruptedException {
		ExtentManager.log("You are inside w3school application and trying to validate the dynamic webtable");

		W3CHomepage home = new W3CHomepage();
		int count = 0;
		String actual = null;

		List<String> actulResult = home.getWebTable();

		for (String ele : actulResult) {
			Thread.sleep(1000);
			count++;
			System.out.println(ele);
			if(ele.equals("Island Trading")) {
			       System.out.println("Company name: " + ele + " is found " + " at position: " + (count));
			       actual = ele;
			       break;
			}
		}
		
		Assert.assertEquals(actual, "Island Trading");
		System.out.println("Test Passed");
		ExtentManager.pass("Test Passed");
		
	}

}
