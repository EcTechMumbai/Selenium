package WebDriver;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdown {
 
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.id("searchInput")).sendKeys("Dansk");;
		Select select=new Select(driver.findElement(By.id("searchLanguage")));
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		/*java.util.List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		for (int i = 0; i < options.size(); i++) {
			
			System.out.println(options.get(i).getText());
		}*/
		
		java.util.List<WebElement> options=driver.findElements(By.tagName("option"));
for (int i = 0; i < options.size(); i++) {
			
			System.out.println(options.get(i).getAttribute("lang"));
}
			
			System.out.println("--------Printing Links------------");
			WebElement block=driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]"));
			java.util.List<WebElement> links=block.findElements(By.tagName("a"));
			
			for (int i = 0; i < links.size(); i++) {
						
						System.out.println(links.get(i).getText());
						
		}
			System.out.println("Total Lnks are : "+links.size());
	}

}
