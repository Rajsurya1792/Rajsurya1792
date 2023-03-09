package FaceBook_newAccount;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Facebook_NewAccount.Login_page;
import Facebook_NewAccount.SignUP_Page;
import Library.Baseclass;
import Library.UtilityClass;

public class CreateNewAccountTestClass extends Baseclass
{
           Login_page obj1;
           SignUP_Page obj2;


            @BeforeClass
            public void browserOpen()
            {
	          chromeBrowser1();
            }

            @Test
           public void tc1()
           {
        	   obj1=new Login_page(driver);
        	   obj1.ClicOnCreateAccount();
           }
            @Test
            public void tc2() throws EncryptedDocumentException, IOException
            {   obj2=new SignUP_Page(driver);
            	obj2.FirstName(UtilityClass.Data(1,0));
            	obj2.SurName(UtilityClass.Data(1, 1));
            	obj2.Email(UtilityClass.Data(1, 2));
            	obj2.Emailconf(UtilityClass.Data(1, 2));
            	obj2.setPassword(UtilityClass.Data(1, 3));
            	obj2.dateOfBirth();
            	obj2.monthOfBirth();
            	obj2.yearOfBirth();
            	obj2.selectGender();
            	obj2.signButton();
            	
            }
            


}
