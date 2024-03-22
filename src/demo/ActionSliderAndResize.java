package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionSliderAndResize {
	WebDriver driver;
	@BeforeTest
	public void beforeRun()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//driver.get("https://www.w3schools.com/howto/howto_js_rangeslider.asp");
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		driver.manage().window().maximize();
	
	}
  @Test
  public void f() {
	  
	  // handling slider 
	//to measure the diamention add "dimentions for chrome" extension   
	  
	  Actions act = new Actions(driver);
	  
	  /*WebElement slider = driver.findElement(By.xpath("//input[@class='slider-color']"));
	  Point pixel = slider.getLocation();
	  System.out.println("The x co-ordinates :"+ pixel.getX());
	  System.out.println("The Y co-ordinates: "+ pixel.getY());
	  act.moveToElement(slider).dragAndDropBy(slider, 477, 23).build().perform();
	  */
	  
	  //Handling Tool-tip 
	  
	  WebElement toolTipLoc = driver.findElement(By.xpath("(//div[@class='tooltip'])[2]"));
	  act.moveToElement(toolTipLoc).build().perform();
	  System.out.println(toolTipLoc.getText());
	  
  }
  
  @AfterTest
  public void afterRun()
  {
	  
  }
}
