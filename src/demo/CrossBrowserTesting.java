package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeTest
	public void start(String url, String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\namita\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
			driver= new FirefoxDriver();;	
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@Test
	public void login() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,\"oxd-button oxd-button\")]")).click();
	}
	@Test(dependsOnMethods = "login")
	public void verifyDahboard()
	{
		String dashboadTile= driver.getCurrentUrl();
		System.out.println(dashboadTile);
		String expectedTitle ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(dashboadTile, expectedTitle, "Invalid URL ");
	}
	
	@AfterTest
	public void end() throws InterruptedException
	{	Thread.sleep(1000);
		driver.close();
	}
}

xecutoe js= (javascriptExecutoe)driver;
js.executeScrit("documnet.getElementById().value='';");
js.executeScript("documnet.getElementByName().click");
windows.scropllBY("200,56","")
JvascriptE