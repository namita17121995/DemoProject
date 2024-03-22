package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicWaits {
	
	WebDriver driver;
	
	@BeforeTest
	public void startTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
	}
  @Test
  public void f() {
	  String text= driver.getTitle();
	  System.out.println(text);
	  
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.name("hjkhk"));
	  
	  WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
	  wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
	   }
  
  @AfterTest
  public void runafterTest() throws InterruptedException
  {
	  Thread.sleep(100);
	  driver.close();
  }
}
