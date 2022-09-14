package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class DropDownRadioChecBoxPage extends BasePage {
	
	public WebDriver driver;
	
	By radioOne = By.xpath("//label[contains(text(), 'One')]/parent::div/input");
	By radioTwo = By.xpath("//label[contains(text(), 'Two')]/parent::div/input");
	By radioThree = By.xpath("//label[contains(text(), 'Three')]/parent::div/input");
	
	By checkBoxRed = By.xpath("//label[contains(text(), 'Red')]/parent::div/input[@Value='Red']");
	By checkBoxGreen = By.xpath("//label[contains(text(), 'Red')]/parent::div/input[@Value='Green']");
	By checkBoxBlue = By.xpath("//label[contains(text(), 'Red')]/parent::div/input[@Value='Blue']");
	
	By carsDropDown = By.xpath("//select[@name='cars']");
	
	

	public DropDownRadioChecBoxPage() throws IOException {
		super();
	}
	
	public WebElement getRadioOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(radioOne);
	}
	
	public WebElement getRadioTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(radioTwo);
	}
	
	public WebElement getRadioThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(radioThree);
	}
	
	public WebElement getCheckBoxRed() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkBoxRed);
	}
	
	public WebElement getCheckBoxGreen() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkBoxGreen);
	}
	
	public WebElement getCheckBoxBlue() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkBoxBlue);
	}
	
	public WebElement getCarsDropDown() throws IOException {
		this.driver = getDriver();
		return driver.findElement(carsDropDown);
	}

}
