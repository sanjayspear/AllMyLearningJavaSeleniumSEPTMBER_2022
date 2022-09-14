package seleniumScripts.seleniumScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.DropDownRadioChecBoxPage;
import pageObjects.Homepage;

@Listeners(resources.Listeners.class)

public class DropDownRadioChecBoxTest extends Hooks {

	Homepage home = null;
	DropDownRadioChecBoxPage drc;

	public DropDownRadioChecBoxTest() throws IOException {
		super();
	}

	@Test
	public void dropDownTest() throws IOException, InterruptedException {
		home = new Homepage();

		home.getDropdownLink().click();
		ExtentManager.pass("Have successfully reached Automation Test Arena Screen");
		// for radio, checkbox and dropdown");

		drc = new DropDownRadioChecBoxPage();
		
		//Radio button test
		ExtentManager.log("started radio button validation...");
		
		drc.getRadioOne().click();
		ExtentManager.pass("Have Successfully Clicked Radio Button ONE");
		Thread.sleep(1000);
		
		drc.getRadioTwo().click();
		ExtentManager.pass("Have Successfully Clicked Radio Button TWO");
		Thread.sleep(1000);
		
		drc.getRadioThree().click();
		ExtentManager.pass("Have Successfully Clicked Radio Button THREE");
		
		ExtentManager.log("End of Radio button validation");
		
		
		//Dropdown test	
		ExtentManager.log("Started Drodown validation...");
		
		WebElement carsList = drc.getCarsDropDown();
		
		//waitForElementToBeClickable(carsList, 10);
		carsList.click();
		ExtentManager.pass("Have successfully Clicked Cars dropdown");
		Thread.sleep(1000);

		Select select = new Select(carsList);

		List<WebElement> options = select.getOptions();
		waitForAllElementVisibility(options, 10);
		
		int size = options.size();
		for (int i = 0; i < size; i++) {
			String text = options.get(i).getText();
			Thread.sleep(1000);
			if (text.equals("Honda")) {
				select.selectByVisibleText(text);
				Assert.assertEquals(text, "Honda");
				ExtentManager.pass("Have successfully selected desired car from the dropdown");
				break;
			}
		}
		
		ExtentManager.log("End of Drodown validation...");
		
	}

}
