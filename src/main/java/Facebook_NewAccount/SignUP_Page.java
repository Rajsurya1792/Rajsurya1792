package Facebook_NewAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUP_Page {
	@FindBy(xpath="//div[@class='_5dbb']/input") private WebElement FName;
	@FindBy(xpath="//input[@name='lastname']") private WebElement SName;
	@FindBy(xpath="//input[@name='reg_email__']") private WebElement EmailId;
	@FindBy(xpath="//input[@name='reg_email_confirmation__']") private WebElement ConEMID;
	@FindBy(id="password_step_input") private WebElement NewPass;
	
	@FindBy(xpath="//select[@title='Day']") private WebElement DOBDate;
	
	@FindBy(xpath="//select[@title='Month']") private WebElement DOBMonth;
	
	@FindBy(xpath="//select[@title='Year']") private WebElement DOBYear;
	
	@FindBy(xpath="(//input[@name='sex'])[2]") private WebElement Gender;
	@FindBy(xpath="//button[@name='websubmit']") private WebElement SignBTN;
	 public  SignUP_Page(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 public void FirstName(String name)
	 {
		 FName.sendKeys(name);
	 }
	
	 public void SurName(String srname)
	 {
		SName.sendKeys(srname);
	 }
	 
	 
	 public void Email(String el)
	 {
		 EmailId.sendKeys(el);
	 }
	 public void Emailconf(String el1)
	 {
		 ConEMID.sendKeys(el1);
	 }
	 public void setPassword(String pass)
	 {
		NewPass.sendKeys(pass);
	 }
	 
	 public void dateOfBirth()
	 {
		DOBDate.click();
		Select sc=new Select(DOBDate);
		sc.selectByIndex(16);
	 }
	 
	 public void monthOfBirth()
	 {    DOBMonth.click();
		 Select sc1=new Select(DOBMonth);
		 sc1.selectByIndex(10);
	 }
	 public void yearOfBirth()
	 {   DOBYear.click();
		 Select sc2=new Select(DOBYear);
		 sc2.selectByValue("1992");
	 }
	 
	 public void selectGender()
	 {
		Gender.click();
	 }
	 public void signButton()
	 {
		SignBTN.click();
	 }
}
