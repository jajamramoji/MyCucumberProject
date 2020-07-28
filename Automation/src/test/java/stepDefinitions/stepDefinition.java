package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	//code to navigate to url
    	System.out.println("Navigate login URL");
        
    }
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("Validated browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
       //code to login 
    	System.out.println("Logged in successfully");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
    	System.out.println("Validating home page");
    }

    @When("^User login into application with \"([^\"]*)\" username and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
        System.out.println(arg2);
        
    }
    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }
    @When("^User sign up follwoing details$")
    public void user_sign_up_follwoing_details(DataTable data) throws Throwable {
    	List<List<String>> obj = data.raw();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    	
    }
    
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
    	System.out.println(username);
        System.out.println(password);
    }
       
    }
    
	

