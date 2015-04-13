// Actual Test Class where you can write the actual test cases 
// 
package tequila.test;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class LondonWeatherTest extends Tequila{
	@Test
	public void londonweather() 
	{
		// methods o set the search in google search text field
		setGoogleSearch("london weather");
		// click on the Go button once search criteria filled 
		clickGoogleGo(uiMap.GO);
		
		// Assert that the weather widget is displayed 
		Assert.assertEquals(driver.findElement(By.cssSelector(uiMap.WEATHERWIDGET)).isDisplayed(),true);
		// display the contents 
		if(driver.findElement(By.cssSelector(uiMap.WEATHERWIDGET)).isDisplayed())
		{ 
			System.out.println("Weather Widget Displayed");
		}
		
		// get the elements for whole week 
		List<WebElement>  allWeakWeather = driver.findElements(By.cssSelector(uiMap.DAILYWEATHER));
		// display the weather forecast for weal  
		for(WebElement day : allWeakWeather )
		{
			System.out.println(day.getText()+"\n");
		}
	}
	
	@AfterClass
	public void quitDriver()
	{
		driver.close();
	}
}

