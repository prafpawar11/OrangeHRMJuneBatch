package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement uname;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement lgnbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void loginFunctionality(String usename, String password) {
		UtilsClass.sendKeys(uname, usename);
		UtilsClass.sendKeys(pass, password);
		UtilsClass.click(lgnbutton);
	}
}
