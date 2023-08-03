package Steps;

import BaseLayer.BaseClass;
import PageLayer.MyInfoPage;
import io.cucumber.java.en.When;

public class MyInfo extends BaseClass{
	
	MyInfoPage page;
	@When("User click on My Info link")
	public void user_click_on_my_info_link() {
		page = new MyInfoPage();
		page.clickOnMyInfoLink();
	    
	}
	@When("User enter Firstname MiddleName LastName")
	public void user_enter_firstname_middle_name_last_name() {
	   page.enterFullName("Kreeti", "abc", "Gandhi");
	}
	@When("User click on save button")
	public void user_click_on_save_button() {
	   page.clickOnSaveButton();
	}
}
