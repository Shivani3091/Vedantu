package testCases_Vedantu;

import org.testng.annotations.Test;

import BaseClass_Vedantu.baseClass_Ved;
import POM_Vedentu.DemoSession;
import Utility_Vedantu.utility_Vedantu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class TC_ClassDropDown extends baseClass_Ved
{
	DemoSession ds;
	
  @BeforeClass
  public void LaunchVedantu() throws InterruptedException
  { 
	  LaunchBrowser();
	  ds=new DemoSession(driver);
	  
   }
  
  @BeforeMethod
   public void scrollIntoBooking()
     {
	  ds.scrollIntoBook(driver);
      }

	
  @Test(priority=0)
  public void validatingLKG() throws InterruptedException, IOException
  {
	  utility_Vedantu.waiting(1000, driver);
	  ds.LKGDropDown(driver);
	  
  }
  
  @Test(priority=1)
  public void validatingUKG() throws InterruptedException, IOException
  {
	  utility_Vedantu.waiting(1000, driver);
	  ds.UKGDropDown(driver);
  }
  
  @Test(priority=2)
  public void validatingClass1() throws InterruptedException, IOException
  {
	  utility_Vedantu.waiting(1000, driver);
	  ds.Cls1DropDown(driver);
  }
  
  @Test(priority=3)
  public void validatingClass8To10() throws InterruptedException, IOException
  {
	  utility_Vedantu.waiting(1000, driver);
	  ds.cls8to10DropDown(driver);
  }
  
  @AfterMethod
  public void refresh()
  {
	  driver.navigate().refresh();
  }

  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
