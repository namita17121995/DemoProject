package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsDemos {
WebDriver driver;
	
	@BeforeTest
	public void berforeRun()
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  Actions a = new Actions(driver);
//	  a.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).build().perform();
//	  driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']")).click();
//	  System.out.println(driver.switchTo().alert().getText());
//	  driver.switchTo().alert().accept();
//	  
	  
	  WebElement source = driver.findElement(By.xpath("//div[@id='box5']"));
	  System.out.println("color before execution: "+ source.getAttribute("style"));
	  WebElement target = driver.findElement(By.xpath("//div[@id='box105']"));
	  
	  a.clickAndHold(source).dragAndDrop(source, target).build().perform();
	  //a.doubleClick().build().perform();
	String value = source.getAttribute("style");
	System.out.println("color after execution :" +value);
	
	a.contextClick(target).build().perform();
	a.doubleClick().build().perform();
	target.sendKeys(Keys.ENTER);
	
;
	}
	
	@AfterTest
	public void afterRun()
	{
		//driver.close();
	}

}
