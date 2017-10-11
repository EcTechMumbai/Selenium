package com.morning.Setup;

import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalaryCountTransformer;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition extends BaseUtil{
	private BaseUtil base;
	public StepDefinition(BaseUtil base) {
		this.base=base;
	}

	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
		
		System.out.println("I navigate to the login page");
	    base.webDriver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
	}
	
	@Given("^I enter users email address as Email:([^\"]*)$")
	public void i_enter_users_email_address_as_Email_admin(@Transform(EmailTransform.class) String email) throws Throwable {
	    System.out.println("Email ID is: "+email);
	    
	}
	
	@Given("^I verify the count digits for rs (\\d+)$")
	public void i_verify_the_count_digits_for_rs(@Transform(SalaryCountTransformer.class)int salary) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("My salary digit count is :"+salary);
	}
	
	@Given("^user navigate to the login page$")
	public void user_navigate_to_the_login_page() throws Throwable {
	    System.out.println("user navigate to the login page");
	    
	}
	
	@Given("^i enter following for login$")
	public void i_enter_following_for_login(DataTable table) throws Throwable {
	    //List<List<String>> data=table.raw();
	    /*System.out.println(data.get(0).get(0));
	    System.out.println(data.get(0).get(1));*/
	   
		List<User> users=new ArrayList<User>();
	    users=table.asList(User.class);
	    
	    LoginPage page=new LoginPage(base.webDriver);
	    
	    for(User user : users) {
		/*base.webDriver.findElement(By.name("email")).sendKeys(user.username);
		base.webDriver.findElement(By.name("password")).sendKeys(user.password);
		base.webDriver.findElement(By.name("confirmPassword")).sendKeys(user.password);
		*/
	    	page.login(user.username, user.password);
	    }
	    		
	}
	
	@Given("^click login button$")
	public void click_login_button() throws Throwable {
		LoginPage page=new LoginPage(base.webDriver);
		page.clickLogin();
		//base.webDriver.findElement(By.name("register")).submit();   
	    
	}

	
	@Then("^I should see the userform page$")
	public void i_should_see_the_userform_page() throws Throwable {
	    System.out.println("I should see the userform page");
		
		String css="html>body>div>table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr>td>p>a>font>b";
	    WebElement web =base.webDriver.findElement(By.cssSelector(css));
	    AssertJUnit.assertEquals("Note: Your user name is Hello", web.getText());
	    System.out.println("My Text is "+web.getText());
	
		}
	
	@Then("^user should see the userform page$")
	public void user_should_see_the_userform_page() throws Throwable {
	    System.out.println("user should see the userform page");
	    
	}
	
	@And("^user enter ([^\"]*) and ([^\"]*)$")
	public void multipleValues(String username,String password)
	{
		System.out.println("Username is:"+username);
		System.out.println("Password is:"+password);
	}
	
	
	
		
	public class User
	{
		public String username;
		public String password;
		
		public User(String userName,String password)
		{
			userName=this.username;
			password=this.password;
		}
		
	}
	
	
	
	
}
