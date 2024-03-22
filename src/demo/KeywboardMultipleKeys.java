package demo;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeywboardMultipleKeys {
	WebDriver driver;
	@BeforeTest
	public void beforeRun()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
	
	}
  @Test
  public void f() {
	  
	  Actions act = new Actions(driver);
	  WebElement textarea= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	  act.sendKeys(textarea, "I am namita yerunkar").build().perform();
	  
	  act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	  act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	  act.sendKeys(Keys.TAB);
	  act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	  
  }
  
  @AfterTest
  public void afterRun()
  {
	  
  }
}
