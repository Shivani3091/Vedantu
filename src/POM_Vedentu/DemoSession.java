package POM_Vedentu;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utility_Vedantu.utility_Vedantu;

public class DemoSession
{
    @FindBy(xpath="//button[@type='submit']") private WebElement demoBtn;
    @FindBy(xpath="//div[text()='Select your Class']") private WebElement clsDrp;
    @FindBy(xpath="//input[@type='text']") private WebElement nameField;
    @FindBy(xpath="//input[@type='tel']") private WebElement mobField;
    @FindBy(xpath="(//label[@class='dropdown_checkboxLabel__Z7aKx'])[13]") private WebElement cls8Drp;
    @FindBy(xpath="//h2[text()='Get Access to Class 3 Study Materials']") private WebElement scrollToBook;
    @FindBy(xpath="(//label[@class=\"dropdown_checkboxLabel__Z7aKx\"])[1]") private WebElement LKG;
    @FindBy(xpath="(//label[@class=\"dropdown_checkboxLabel__Z7aKx\"])[2]") private WebElement UKG;
    @FindBy(xpath="(//label[@class=\"dropdown_checkboxLabel__Z7aKx\"])[3]") private WebElement class1;
    @FindBy(xpath="(//label[@class=\"dropdown_checkboxLabel__Z7aKx\"])[13]") private WebElement class1To10;
    
    
    public DemoSession (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void scrollIntoBook(WebDriver driver)
    {
    	utility_Vedantu.ScrollIntoView(driver,scrollToBook );
    }
    
    public void LKGDropDown(WebDriver driver) throws InterruptedException, IOException
    {
    	clsDrp.click();
    	Thread.sleep(1000);
    	LKG.click();
    	Thread.sleep(1000);
    	utility_Vedantu.takeScreenshot(driver);
     }
    
    public void UKGDropDown(WebDriver driver) throws InterruptedException, IOException
    {
    	clsDrp.click();
    	Thread.sleep(1000);
    	UKG.click();
    	Thread.sleep(1000);
    	utility_Vedantu.takeScreenshot(driver);
    }
    
    public void Cls1DropDown(WebDriver driver) throws InterruptedException, IOException
    {
    	clsDrp.click();
    	Thread.sleep(1000);
    	class1.click();
    	Thread.sleep(1000);
    	utility_Vedantu.takeScreenshot(driver);
    }
    
    public void cls8to10DropDown(WebDriver driver) throws InterruptedException, IOException
    {
    	clsDrp.click();
    	Thread.sleep(1000);
    	class1To10.click();
		Thread.sleep(1000);
		utility_Vedantu.takeScreenshot(driver);
    }
    
    public void validatingNameField(String excel) throws EncryptedDocumentException, IOException, InterruptedException
    {
    	nameField.sendKeys(excel);
    	Thread.sleep(1000);
    }
    
    public void validaingMobField(String num) throws InterruptedException
    {
    	mobField.sendKeys(num);
    	Thread.sleep(1000);
    	
    }

	
		
	}
    
    
	
	

