package ECommerce.ECOMMERCE_AMAZON;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_Login 
{
  @FindBy(id="ap_email") private WebElement USRnM;
  @FindBy(id="continue") private WebElement CONT;
  @FindBy(id="ap_password") private WebElement PWD;
  @FindBy(xpath="(//input[@type='submit'])[1]") private WebElement LGBTN;
  
  public WebDriver driver;
  Amazon_Login(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void uerName(String UN)
  {
	  USRnM.sendKeys(UN);
  }
  public void contiBtn()
  {
	 CONT.click();
  }
  public void passWord(String PW)
  {
	  PWD.sendKeys(PW);
  }
  
  public void ckLogin() 
  {
	
	  LGBTN.click();
  }
  
  
  
}
