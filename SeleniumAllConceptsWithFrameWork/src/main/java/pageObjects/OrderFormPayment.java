package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class OrderFormPayment extends BasePage {

	public WebDriver driver;
	
	By payByCheck = By.xpath("//span[.='Pay by Check']");
	By payByWire = By.xpath("//span[.='Pay by bank wire']");
	By termsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
	By orderBtn = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");
	
	public OrderFormPayment() throws IOException {
		super();
	}
	
	public WebElement getPayByCheckRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payByCheck);
	}
	
	public WebElement getPayByWireRadioBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payByWire);
	}
	
	public WebElement getTermsConditionsCheckbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(termsAndConditions);
	}

	public WebElement getOrderBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(orderBtn);
	}
	
}
