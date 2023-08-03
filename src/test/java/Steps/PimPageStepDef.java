package Steps;

import BaseLayer.BaseClass;
import PageLayer.PimPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PimPageStepDef extends BaseClass

{

	private static PimPage pimpage;

	static String EmpID;

	@When("user click on PIM link")
	public void user_click_on_pim_link() {
		pimpage = new PimPage();
		pimpage.clickOnPimlink();
	}

	@Then("Click on Add Employee")
	public void click_on_add_employee() {
		pimpage.clickOnAddEmp();

	}

	@Then("Enter Firstname MiddleName LastName and capture the Empid")
	public void enter_firstname_middle_name_last_name_and_capture_the_empid() {

		EmpID = pimpage.EnterEmpINfoFunctionality("Gauri", "Prathamesh", "Chawathe");

	}

	@Then("Click on save button.")
	public void click_on_save_button() {
		pimpage.clickOnSave();
	}
}
