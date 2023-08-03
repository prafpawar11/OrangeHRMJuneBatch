package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class MyInfoPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement myInfo;
	
	@FindBy(name="firstName")
	private WebElement Fname;
	
	@FindBy(name="middleName")
	private WebElement Mname;
	
	@FindBy(name="lastName")
	private WebElement Lname;
	
	@FindBy(xpath="(//button[text()=' Save '])[1]")
	private WebElement SubmitButton;
	
	public MyInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyInfoLink()
	{
		UtilsClass.click(myInfo);
	}
	
	public void enterFullName(String fname, String mname, String lname)
	{
		UtilsClass.sendKeys(Fname, fname);
		UtilsClass.sendKeys(Mname, mname);
		UtilsClass.sendKeys(Lname, lname);
	}
	
	public void clickOnSaveButton()
	{
		UtilsClass.click(SubmitButton);
	}
}
