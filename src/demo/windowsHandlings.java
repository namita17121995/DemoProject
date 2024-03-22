package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowsHandlings {
	WebDriver driver;
	@BeforeTest 
	public void beforeRun()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
	}
  @Test
  public void f() {
	  String parentWindow = driver.getWindowHandle();
	  driver.findElement(By.id("tabButton")).click();
	  System.out.println(parentWindow);
	  
	  Set<String> windowAddress= driver.getWindowHandles();
	
	  for (String window : windowAddress) {
		  driver.switchTo().window(window);
	}
	 System.out.println( driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText());
  }
  
  @AfterTest
  public void afterRun()
  {
	  driver.close();
  }
}
