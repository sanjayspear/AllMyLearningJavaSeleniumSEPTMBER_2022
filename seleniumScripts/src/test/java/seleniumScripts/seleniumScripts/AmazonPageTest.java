package seleniumScripts.seleniumScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPageTest extends BaseClass {
	WebDriverWait wait;
	List<WebElement> list;
	String data = null;
	int count=0;

	@Test
	public void amazonTest() throws InterruptedException {

		try {
			driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Honey");
		} catch (StaleElementReferenceException e) {
			driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Honey");
		}

		try {
			list = driver.findElements(By.xpath("//div[contains(text(), 'honey')]"));
			wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfAllElements(list));

		} catch (StaleElementReferenceException e) {
			list = driver.findElements(By.xpath("//div[contains(text(), 'honey')]"));
			wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfAllElements(list));
		}

		for (WebElement e1 : list) {
			data = e1.getText();
			Thread.sleep(1000);
			System.out.println(data);
			count++;
		}
		
		System.out.println("Total number of products are: "+count);
		
		Assert.assertEquals(count, 9);
	}

}
