// Main class to initiate the selenium webdriver and static methods for use in the actual tests 
// Implemented example with SeleniumHq and  TestNG  
package tequila.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Tequila {
	public static WebDriver driver;
	private String baseUrl;

	@BeforeTest
	public void setUp() throws Exception 
	{
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.co.uk/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	// Method to set search field in the google 
	public static void setGoogleSearch(String search)
	{
		driver.findElement(By.cssSelector(uiMap.SEARCHINPUT)).sendKeys(search);
		driver.findElement(By.cssSelector(uiMap.SEARCHINPUT)).sendKeys(Keys.ENTER);
	}
	// methods to click on the google go button 
	public static void clickGoogleGo(String selector)
	{
		driver.findElement(By.cssSelector(selector)).click();
	}
	
	
}
