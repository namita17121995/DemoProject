package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BootStarpDD {
	WebDriver driver;
	@BeforeTest 
	public void beforeRun()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.hdfc.com/");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
	}
	
	@Test
	public void f() 
	{
		driver.findElement(By.xpath("//div[@class=\"product-tabs-wrap product-category-wrap\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterTest
	public void afterRun()
	{
		driver.close();
	}
	
}
