package ECommerce.ECOMMERCE_AMAZON;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.Baseclass;
import Library.UtilityClass;

public class AmazonLoginclickTclass extends Baseclass
{
	Amazon_Login Aobj;
	LoginButtonClickclas Aobj1;
	Amazon_Login Aobj2;
	@BeforeClass
	public void browserlaunch()
	{
		chromeBrowser();
		Reporter.log("Browser launched Successfully.............");
	}
	@Test(priority=1)
	public void loginclicl()
	{
		Aobj1=new LoginButtonClickclas(driver);
		
		Aobj1.loginClick();
		Reporter.log("Clicked on login button  Successfully.............");
	}
	@Test(priority=2)
	public void loginTC() throws EncryptedDocumentException, IOException
	{
		Aobj2=new Amazon_Login (driver);
		Aobj2.uerName(UtilityClass.Data(0,0));
		Aobj2.contiBtn();
		Aobj2.passWord(UtilityClass.Data(0,1));  
		Aobj2.ckLogin();
		String expectedResult = "Login successful";
		String actualResult = driver.findElement(By.id("successMessage")).getText();
		Assert.assertEquals(actualResult, expectedResult, "Login failed");

	}
	
	
	
	
	
	
	
}
