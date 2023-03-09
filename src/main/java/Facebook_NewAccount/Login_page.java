package Facebook_NewAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page 
{
	
	 
 @FindBy(xpath="//div[@class='_6ltg']//a") private WebElement CliclCreateAccoumt;
 
 
 public  Login_page(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);                  



 }
 
 
 public void ClicOnCreateAccount()
 {  
	 CliclCreateAccoumt.click();
	 
 }
 
 
 
}
