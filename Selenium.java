# In Chrome  using Selenium Driver Test Amazon side

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo
{
	Public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","c:\\Selenium\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		Driver.get("http://amazon.in");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement SearchBox = driver.findElement(By.id("twotabsearchbox"));
		SearchBox.sendKeys("JBL Earphones");
		
		WebElement SearchIcon = driver.findElement(By.className("nav-input"));
		SearchIcon.click();

		WebElement CheckBox = driver.findElement(By.name("s-ref-checkbov=x-Boat"));
		CheckBox.click();
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,4000)");
		
		Thread.sleep(4000);
		driver.quit();
	}
}
		
		
