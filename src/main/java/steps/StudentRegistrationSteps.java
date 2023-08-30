package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javamethod.PracticeFormMethods;
import javamethod.StudentRegistration;

public class StudentRegistrationSteps {
	private WebDriver driver;
	private String filePath;

	public StudentRegistrationSteps() {
		driver = Hooks.driver;
	}

	@Given("User is on the registration page {string}")
	public void user_is_on_the_registration_page(String url) throws InterruptedException

	{

		StudentRegistration.launchBrowser(driver, url);

	}

	@And("User enter the First name as {string} and Last name as {string}")
	public void user_enter_the_first_name_as_and_last_name_as(String fname, String lname) {
		StudentRegistration.enterFirstName(driver, fname);
		StudentRegistration.enterLasttName(driver, lname);
	}

	@When("User enter the Email address as {string}")
	public void user_enter_the_email_address_as(String email) {
		StudentRegistration.enterEmail(driver, email);

	}

	@And("User select the gender as {string}")
	public void user_select_the_gender_as(String string) {
		StudentRegistration.selectGender(driver);

	}

	@And("User enter the mobile number as {string}")
	public void user_enter_the_mobile_number_as(String Phone) {
		StudentRegistration.enterPhoneNumber(driver, Phone);

	}

	@And("User select the date of birth")
	public void user_select_the_date_of_birth() {
		StudentRegistration.selectDate(driver);
		

	}

	@And("User select the Subject as {string}")
	public void user_select_the_subject_as(String subject) {
		StudentRegistration.enterSubject(driver, subject);

	}

	@And("User select the hobbies as {string}")
	public void user_select_the_hobbies_as(String string) {
		StudentRegistration.selectHobbies(driver);

	}

	@And("User upload the image")
	public void user_upload_the_image() {
		StudentRegistration.uploadImage(driver);
		
	}
		
	

	@And("User enter the address as {string}")
	public void user_enter_the_address_as(String address) {
		StudentRegistration.enterAddress(driver, address);

	}

	@And("User select state as {string} and city as {string}")
	public void user_select_state_as_and_city_as(String state, String city) {
		StudentRegistration.selectState(driver, state);
		StudentRegistration.selectcity(driver, city);

	}

	@And("User click on the Submit button")
	public void user_click_on_the_submit_button() throws InterruptedException {
		StudentRegistration.Submit(driver);

	}

	@Then("User should be able to register")
	public void user_should_be_able_to_register() throws InterruptedException {
		StudentRegistration.Submit(driver);

	}

//	@Then("User enters different values {string} and {string} and {string} and {string} and {string}")
//	public void use_Enters_same_Values(int number, String name, float marks, long phone, String email) {
//
//		StudentRegistration.differentvalues(number, name, marks, phone, email);*/
//
//	}

	
	}


