package demo;

import java.awt.Dimension;
import java.awt.image.BufferedImage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SikuliDemo {
	WebDriver driver;
	@BeforeTest
	public void beforeRun()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=wv7XUzlVi3Y");
		driver.manage().window().maximize();
	
	}
  @Test
  public void f() throws FindFailed, InterruptedException {
	  Screen s = new Screen();
	  Thread.sleep(7000);
	  s.click("C:\\Users\\namita\\eclipse-workspace\\demo\\sikuluscreenshots\\play.png");
  }
  
  @AfterTest
  public void afterRun()
  {
	  
  }
}
