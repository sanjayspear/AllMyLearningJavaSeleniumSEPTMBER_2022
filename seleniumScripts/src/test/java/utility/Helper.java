package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import seleniumScripts.seleniumScripts.BaseClass;


public class Helper {
	
	public static Properties pro;

	public static void ConfigReader() {

		try {
			
			String path=System.getProperty("user.dir")+"/Configuration/config.properties";
			FileInputStream fis = new FileInputStream(new File(path));

			pro = new Properties();

			pro.load(fis);

		} catch (Exception e) {

			System.out.println("Unable to load config file");
		}
	}

	public static String captureScreenShot(WebDriver driver) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/Screenshots/"+BaseClass.getDate()+".png";
		
		try {
			
			FileUtils.copyFile(src, new File(path));
		}  
		catch (IOException e) {
			
			System.out.println("Exception while capturing screenshot");
			System.out.println("Full info about exception :"+e.getMessage());
		}
		
		catch (Exception e)	{
			System.out.println("Exception while capturing screenshot");
			System.out.println("Full info about exception :"+e.getMessage());
		}

		finally	{
			
		}
		
		return path;
	}
	
}
