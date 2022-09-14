package InterviewDemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import base.BaseClass;

public class SeleniumDemo extends BaseClass {
	Logger log = Logger.getLogger(SeleniumDemo.class);

	@BeforeMethod
	public void loginToApp() {
		log.info("Looged In ...");
		driver.get("https://test.io/coverage/website-testing");
	}

	@Test(priority = 1)
	public void validateAcceptAllCookiesTest() throws InterruptedException {


	}

	@BeforeMethod
	public void loginOut() {
		log.info("Logged Out");
	}
}
