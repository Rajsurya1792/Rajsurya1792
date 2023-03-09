package Facebook_NewAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooklogin 
{
 @FindBy(xpath="//input[@name='email']") private WebElement UID;
 @FindBy(xpath="//input[@name='pass']") private WebElement PWD;
 @FindBy(xpath="//button[@value='1']") private WebElement CLK;
 
 public facebooklogin (WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	 
 }
 public void login(String id)
 {
	 UID.sendKeys(id);
 }
	
 public void passWord(String pd)
 {
	 PWD.sendKeys(pd);
 }
 public void clickOnLogin()
 {
	 CLK.click();
 }
	
	
	
	
	
}
