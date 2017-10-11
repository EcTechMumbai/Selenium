$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2627701012,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter users email address as Email:admin",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I verify the count digits for rs 1000",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i enter following for login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "Hello",
        "World"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_navigate_to_the_login_page()"
});
formatter.result({
  "duration": 1700731580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 37
    }
  ],
  "location": "StepDefinition.i_enter_users_email_address_as_Email_admin(String)"
});
formatter.result({
  "duration": 975902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 33
    }
  ],
  "location": "StepDefinition.i_verify_the_count_digits_for_rs(int)"
});
formatter.result({
  "duration": 514665,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_following_for_login(DataTable)"
});
formatter.result({
  "duration": 172315710,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_login_button()"
});
formatter.result({
  "duration": 40774480,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_should_see_the_userform_page()"
});
formatter.result({
  "duration": 48860008,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: html\u003ebody\u003ediv\u003etable\u003etbody\u003etr\u003etd\u003etable\u003etbody\u003etr\u003etd\u003etable\u003etbody\u003etr\u003etd\u003etable\u003etbody\u003etr\u003etd\u003ep\u003ea\u003efont\u003eb\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027IN-M307WFY1\u0027, ip: \u002710.90.18.101\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\UGHAWT~1.001\\AppData\\Local\\Temp\\rust_mozprofile.TDEDXF0VQsum, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0.0, page load\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, platform\u003dANY, specificationLevel\u003d0.0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d52.4.0, platformVersion\u003d6.1, moz:processID\u003d3600.0, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dwindows_nt}]\nSession ID: 3620c906-d14e-40d8-9a42-8107125c1b7c\n*** Element info: {Using\u003dcss selector, value\u003dhtml\u003ebody\u003ediv\u003etable\u003etbody\u003etr\u003etd\u003etable\u003etbody\u003etr\u003etd\u003etable\u003etbody\u003etr\u003etd\u003etable\u003etbody\u003etr\u003etd\u003ep\u003ea\u003efont\u003eb}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:501)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat com.morning.Setup.StepDefinition.i_should_see_the_userform_page(StepDefinition.java:85)\r\n\tat ✽.Then I should see the userform page(src/test/resources/Features/login.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 58642576,
  "status": "passed"
});
});