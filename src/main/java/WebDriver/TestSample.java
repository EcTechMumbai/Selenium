package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		WebElement element;
		element=driver.findElement(By.id("identifierId"));
		element.sendKeys("usamaghawte16@gmail.com");
		element=driver.findElement(By.className("CwaK9"));
		element.click();
		WebDriverWait wait= new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		
		element=driver.findElement(By.name("password"));
		element.sendKeys("1234");
		element=driver.findElement(By.className("CwaK9"));
		element.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		element=driver.findElement(By.cssSelector("div[jsname=B34EJ]"));
		System.out.println(element.getText());
	}

}
