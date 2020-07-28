package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	public WebDriver driver;
	public HomePage(WebDriver driver)// Here create constructor from stepDefinition to Homepage class
	{
		this.driver=driver; //Here assign constructor obj to local variable driver
	}
	By search=By.xpath("//input[@type='search']");

	
	public WebElement getSearch()
	{
		return driver.findElement(search); //In this method need to return then only stepDef will understand
	}
}
