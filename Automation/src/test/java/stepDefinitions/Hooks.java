package stepDefinitions;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  extends Base
{
	@Before("@mobiletest")
	public void beforevalidation(){
		System.out.println("Before mobile hook");
	}
	@After("@mobiletest")
	public void aftervalidation()
	{
		System.out.println("After mobile hook");
	}
	@After("@seleniumtest")
	public void afterseleniumtest()
	{
		driver.close();
	}
	@Before("@Webtest")
	public void beforewebvalidation(){
		System.out.println("Before web hook");
	}
	@After("@Webtest")
	public void afterwebvalidation()
	{
		System.out.println("After web hook");
	}

}
