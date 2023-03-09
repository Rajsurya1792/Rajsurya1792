package ECommerce.ECOMMERCE_AMAZON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginButtonClickclas
{

    @FindBy(xpath="//div[@id='nav-tools']//a[2]") private WebElement CL;
    
    
    public  LoginButtonClickclas (WebDriver driver)
    {
   	 PageFactory.initElements(driver, this);
   	 
    }
    
    public void loginClick()
    {
   	 CL.click();
   	 
    }
}
