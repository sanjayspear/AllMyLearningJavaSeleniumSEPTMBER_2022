package pageObjectsmislionious;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class W3CHomepage extends BasePage {

	public WebDriver driver;
	public List<String> list = new ArrayList<String>();
	
	// *[@id='customers']/tbody/tr[1]/td[1]
	// *[@id='customers']/tbody/tr[2]/td[1]
	// *[@id='customers']/tbody/tr[3]/td[1]
	// *[@id='customers']/tbody/tr[4]/td[1]
	// *[@id='customers']/tbody/tr[5]/td[1]
	// *[@id='customers']/tbody/tr[6]/td[1]

	
	String beforeXpath = "//*[@id='customers']/tbody/tr[";
	String afterXpath = "]/td[1]";
	String actualXpath=null;
	
	By rows = By.xpath("//*[@id='customers']/tbody/tr");
	
	
	public W3CHomepage() throws IOException {
		super();
	}
	
	public List<String> getWebTable() throws IOException {
		this.driver = getDriver();
		List<WebElement> row = driver.findElements(rows);
		int rowCount = row.size();
		for(int i=2; i<=rowCount; i++) {
			actualXpath = beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			list.add(element.getText());
		}
		return list;
		
	}
	
	
	

	

}
