package demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alertsHandling {
	WebDriver driver;
	
	@BeforeTest
	public void berforeRun()
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  //driver.findElement(By.id("alertButton")).click();
	  //driver.findElement(By.id("timerAlertButton")).click();
	  //Thread.sleep(5);
	  driver.findElement(By.id("promtButton")).click();
//	  WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
//	  w.until(ExpectedConditions.alertIsPresent());
	  
	  Alert a = driver.switchTo().alert();
	  System.out.println(a.getText());
	  a.sendKeys("I am namita");
	  a.accept();
	  
	  
  }
	
	@AfterTest
	public void afterRun()
	{
		driver.close();
	}
}
