package com.morning.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
//@Cucumber.Options(format={"pretty", "html:target/cucumber", "json:target/Cucumber.json"},tags={"@web"})
//@CucumberOptions(features={"/Setup/src/Features/login.feature"},glue="com.morning.Setup", format={"pretty", "html:target/cucumber", "json:target/Cucumber.json"})
@CucumberOptions(features = { "src/test/resources/Features/login.feature" }, glue = "com.morning.Setup", plugin = { "html:target/cucumber-pretty", "json:target/Cucumber.json" })

public class Runner extends AbstractTestNGCucumberTests {					

}
