package demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDependencies {
	
	@BeforeTest
	public void beforeRun() {
		System.out.println("I am inside beforerUN mETHOD");
		
	}
  @Test(dependsOnMethods={"f3","f4"},alwaysRun=true)
  public void f1() {
	  System.out.println("This is first Logic");
  }
  
  @Test(dependsOnGroups = "smoke1")
  public void f2() {
	  System.out.println("This is second Logic");
  }
  
  @Test(groups = "smoke1")
  public void f3() {
	  System.out.println("This is Third Logic");
	 
  }
  @Test(groups="smoke1")
  public void f4() {
	  System.out.println("This is Fourth Logic");
	 Assert.fail();
  }
  
  @AfterTest
  public void afterRun()
  {
	  System.out.println("I am inside after run mehod");
  }
}

