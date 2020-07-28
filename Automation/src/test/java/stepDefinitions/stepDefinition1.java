package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	@RunWith(Cucumber.class)
	public class stepDefinition1 
	{
		public WebDriver driver;
	    @Given("^user is on yatra landing page$")
	    public void user_is_on_yatra_landing_page() throws Throwable 
	    {
	    	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Drivers\\chromedriver.exe");
	    	driver=new ChromeDriver();
		    driver.get("https://www.goibibo.com/");
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	    }

	    @When("^user searching from \"([^\"]*)\" to \"([^\"]*)\"$")
	    public void user_searching_from_something_to_something(String source, String destination) throws Throwable 
	    {
	    	
	    	driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys(source+Keys.ARROW_DOWN+Keys.ENTER);
	    	
	    	Thread.sleep(5000);
	    	
	    	driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).sendKeys(destination+Keys.ARROW_DOWN+Keys.ENTER);
	        
	    }


	    @And("^user click the traveling date$")
	    public void user_click_the_traveling_date() throws Throwable 
	    {
	    	
	    	driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
	    	
	    	String month = "August 2020";
	    	String day = "20";

			while(true)
			{
				String text = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
				if(text.equals(month))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				}
			}
			
			List<WebElement> date = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
			for(int i=0;i<date.size();i++)
			{
				if(date.get(i).getText().contains(day))
				{
					date.get(i).click();	
				}

			}
		}
	    	
	
		@And("^user click on search button$")
	    public void user_click_on_search_button() throws Throwable 
		{
			driver.findElement(By.xpath("//button[@id='gi_search_btn']")).click();
	        
	    }

	    @And("^user able to see all the available flights and select the desired flight$")
	    public void user_able_to_see_all_the_available_flights_and_select_the_desired_flight() throws Throwable 
	    {
	    	driver.findElement(By.xpath("//span[contains(text(),'4pm - 9pm')]")).click();
	    	driver.findElement(By.xpath("//div[contains(@class,'paleGreyBg2 width100 fl')]//div[1]//div[1]//div[1]//div[1]//div[2]//span[1]//span[1]//input[1]")).click();
	                   
	    }
	    @And("^user enter personal details Firstname \"([^\"]*)\" Middlename as \"([^\"]*)\" Lastname as \"([^\"]*)\"$")
	    public void user_enter_personal_details_firstname_something_middlename_as_something_lastname_as_something(String Firstname, String Middlename, String Lastname) throws Throwable {
	    	Set<String> windows = driver.getWindowHandles();
	    	Iterator<String> it = windows.iterator();
	    	String parient = it.next();
	        String child = it.next();
	        driver.switchTo().window(child);
	        Select s=new Select(driver.findElement(By.xpath("//select[@id='Adulttitle1']")));
	        s.selectByVisibleText("Mr");
	        driver.findElement(By.xpath("//input[@id='AdultfirstName1']")).sendKeys(Firstname);
	        driver.findElement(By.xpath("//input[@id='AdultmiddleName1']")).sendKeys(Middlename);
	        driver.findElement(By.xpath("//input[@id='AdultlastName1']")).sendKeys(Lastname);
	         	
	    }


	    @And("^user enter Email as \"([^\"]*)\" and Mobilenumber as \"([^\"]*)\"$")
	    public void user_enter_email_as_something_and_mobilenumber_as_something(String Email, String Mobilenumber) throws Throwable 
	    {
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
	        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(Mobilenumber);
	    }

	    @Then("^user click on procced to Payments for book flight ticket$")
	    public void user_click_on_procced_to_payments_for_book_flight_ticket() throws Throwable 
	    {
	       driver.findElement(By.xpath("//div[@class='fl width100 borderTop padLR15 padTB10']//div[1]")).click();
	    }
}


