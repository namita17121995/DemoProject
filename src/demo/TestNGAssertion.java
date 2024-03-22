package demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertion {
	
	@BeforeTest
	public void beforeRun()
	{
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false, "this is soft assertion sutom exception");
		  //Assert.assertTrue(false, "this is custom exceptiom");
		sa.assertAll();
		
	//Assert.assertEquals(false, true);
	
	}
  @Test
  public void logic1() {
	 // SoftAssert sa = new SoftAssert();
	  //sa.assertTrue(false, "this is soft assertion sutom exception");
	  //Assert.assertTrue(false, "this is custom exceptiom");
	  System.out.println("You are inside logic 1");
	  //sa.assertAll();
  }
  
  
  @Test
  public void logic2() {
	  System.out.println("You are inside logic 2");

  }
  
  @Test
  public void logic3() {
	  System.out.println("You are inside logic 3");

  }
  
  @AfterTest
  public void afterRun()
  {
	  
  }

}
