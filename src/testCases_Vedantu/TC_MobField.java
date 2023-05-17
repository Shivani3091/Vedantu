package testCases_Vedantu;

import org.testng.annotations.Test;

import BaseClass_Vedantu.baseClass_Ved;
import POM_Vedentu.DemoSession;
import Utility_Vedantu.utility_Vedantu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;

public class TC_MobField extends baseClass_Ved
{ 
	DemoSession ds;
	
	 @BeforeClass
	  public void LaunchingSite() throws InterruptedException
	 {
		  LaunchBrowser();

		 ds=new DemoSession(driver);
		 
	  }
	 
	@BeforeMethod
	  public void scrollIntoView()
	{
		ds.scrollIntoBook(driver);
		
	 }
	
  @Test
  public void validatingMobField() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  utility_Vedantu.waiting(1000, driver);
	  ds.validaingMobField(utility_Vedantu.Excel(1, 0));
	  utility_Vedantu.waiting(1000, driver);
  }
  

  @AfterClass
  public void afterClass()
  {
	  driver.quit();
  }

}
