package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	driver=Base.getdriver();
        
                   	
    }

    @When("^User searched for \"([^\"]*)\" vegtable$")
    public void user_searched_for_something_vegtable(String strArg1) throws Throwable {
        // xpath: //tagname[@attribute='value']
    	h=new HomePage(driver);
    	h.getSearch().sendKeys("Cucumber");
    	Thread.sleep(3000);
    	
    	
    }

    @Then("^\"([^\"]*)\" result are displayed$")
    public void something_result_are_displayed(String strArg1) throws Throwable {
       Assert.assertTrue( driver.findElement(By.xpath("//h4[@class='product-name']")).getText().contains(strArg1));
    }
    
    @Then("^verify selected \"([^\"]*)\" items are displayed in check out page$")
    public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {
    	Assert.assertTrue( driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click(); 
       
        }

}