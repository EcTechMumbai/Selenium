package com.morning.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.NAME,using="email")
	public WebElement txtusername;
	
	@FindBy(how=How.NAME,using="password")
	public WebElement txtpassword;
	
	@FindBy(how=How.NAME,using="confirmPassword")
	public WebElement txtConfirmpassword;
	
	@FindBy(how=How.NAME,using="register")
	public WebElement txtlogin;
	
	public void login(String username,String password)
	{
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		txtConfirmpassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		try{
				txtlogin.submit();
				System.out.println("Login Submit");
		}
		catch(Exception e){
			System.out.println("Login Submit Error");
		}
	}
	
}
