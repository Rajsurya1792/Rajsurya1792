package FaceBook_newAccount;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Facebook_NewAccount.facebooklogin;
import Library.Baseclass;
import Library.UtilityClass;

public class TestClassforFacebookLogin extends Baseclass
{
	
	
	facebooklogin obj1;
	ChromeOptions opt;
	
     
   @BeforeClass
	public void Browseropen(String browser)
	{
        chromeBrowser1();
    }
       
       
       @Test
    /*   public void TC1() throws EncryptedDocumentException, IOException
       {
    	   obj1=new facebooklogin(driver);
    	   obj1.login(UtilityClass.Data(2, 0));
    	   obj1.passWord(UtilityClass.Data(2, 1));
    	   obj1.clickOnLogin();
    	   opt.addArguments("--desable-notifications");
       }   
       */
       
       public void TC1() throws EncryptedDocumentException, IOException
       {
    	   obj1=new facebooklogin(driver);
    	   obj1.login(UtilityClass.Data(2,0));
    	   obj1.passWord(UtilityClass.Data(2,1));
    	   obj1.clickOnLogin();
    	   
       }
       @AfterMethod
       public   void T() throws IOException 
       {
    	   UtilityClass.Screnshot(driver);
       }
       @Test
       public void TC2() throws InterruptedException
       { Thread.sleep(5000);
    	   driver.quit();
       }
       
	
}
