package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass {

	private static HomePage homepage;

	@When("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
		homepage = new HomePage();
		Assert.assertEquals(homepage.getTitle(), "OrangeHRM");
	}

	@When("validate home page url")
	public void validate_home_page_url() {
		Assert.assertEquals(homepage.getCurrentUrl().contains("hrm"), true);
	}

	@When("validate home page logo")
	public void validate_home_page_logo() {
		Assert.assertEquals(homepage.getLogoStatus(), true);
	}

}
