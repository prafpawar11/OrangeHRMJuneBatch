package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class PimPage extends BaseClass

{

	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PimLink;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement AddEmp;
	
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(name="middleName")
	private WebElement mname;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Empid;
	
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement Savebutton;
	
	public PimPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPimlink()
	{
		UtilsClass.click(PimLink);
	}
	
	public void clickOnAddEmp()
	{
		UtilsClass.click(AddEmp);
	}
	
	public String EnterEmpINfoFunctionality(String Fname, String Mname, String Lname)
	{
		
		UtilsClass.sendKeys(fname, Fname);
		UtilsClass.sendKeys(mname, Mname);
		UtilsClass.sendKeys(lname, Lname);
		return Empid.getText();
		
	}
	
	
	public void clickOnSave()
	{
		UtilsClass.click(Savebutton);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
