package com.morning.Setup;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {
	//public WebDriver webDriver;
	private BaseUtil base;
	public Hook(BaseUtil base) {
		this.base=base;
	}

	@Before
	public void InitializeTest()
	{
		System.out.println("Opening the browser : FireFox");
		System.setProperty("webdriver.gecko.driver","C:\\work\\Geko\\geckodriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		base.webDriver = new FirefoxDriver();
		//webDriver=new FirefoxDriver();
	}

	@After
	public void TearDownTest()
	{
		
		System.out.println("Closing the browser : MOCK");
		base.webDriver.close();
	}
}
