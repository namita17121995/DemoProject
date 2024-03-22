package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selectDropDownWebdriver<WebElements> {
	WebDriver driver;
	@BeforeTest
	public void startTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
			
	}
  @Test
  public void f() {
  
  WebElement dropdown = driver.findElement(By.id("Form_getForm_Country")); 
  Select value = new Select(dropdown);
//  value.selectByIndex(2);
//  value.selectByValue("Bermuda");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  List<WebElement> li= value.getOptions();
  for (WebElement webElement : li) {
	
	  if(webElement.getText().equals("india"))
	  {
		  webElement.click();
	  }
	  
}
  
  
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.close();
  }
}
