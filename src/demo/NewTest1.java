package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	
	@BeforeSuite
	public void runBefore()
	{
		System.out.println("This is before run");
	}
  
	@BeforeTest
	public void runBeforeTest()
	{
		System.out.println("This is beore run test block");
	}
	
	@BeforeClass
	public void runBeforeClass()
	{
		System.out.println("This is beforeclass block");
	}
	
	@BeforeMethod(groups="smoke")
	public void runBeofreMethos()
	{
		System.out.println("This is inside beofreMethod block");
	}
	
	@Test(enabled=false)
	public void firstMethod() {
	  System.out.println("This is first methos #1");
	}
	
	@Test(priority=2,groups="smoke")
	public void secondMethod() {
	  System.out.println("This is second methos #2");
	}
	
	@Test(priority=1,groups="smoke")
	public void thirdMethod() {
	  System.out.println("This is third method #3");
	}
	
	@Test(priority=2,groups="sanity")
	public void seccondMethod() {
	  System.out.println("This is second methos #5");
	}
	
	@Test(priority=1,groups="sanity")
	public void thiirdMethod() {
	  System.out.println("This is third method #4");
	}
	
	@AfterMethod(groups="smoke")
	public void runAfterMethod()
	{
		System.out.println("This is inside afterMethod block");
	}
	@AfterClass
	public void runAfterClass()
	{
		System.out.println("This is runafterClass block");
	}
	@AfterTest()
	public void runAfterTest()
	{
		System.out.println("this is aftertest block");
	}
  
	@AfterSuite
	public void runAfter()
	{
	  System.out.println("This is run after");
	}
}
