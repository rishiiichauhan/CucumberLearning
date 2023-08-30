package steps;

import org.openqa.selenium.TimeoutException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javamethod.StudentRegistration;

public class TabsAndWindowsSteps {
	
	

	@Given("User is on the registration page {string}")
	public void user_is_on_the_registration_page(String URL) throws InterruptedException

	{

		StudentRegistration.launchBrowser(driver, URL);
		
	 
	}

	
	
 	
	@When("User click on the New Tab button")
	public void user_click_on_the_new_tab_button() {
		
	     
	     
	}

	@And("Click on the New Window button")
	public void click_on_the_new_window_button() {
	     
	     
	}

	@And("Click on the New Window Image button")
	public void click_on_the_new_window_image_button() {
	     
	     
	}

	@Then("User should be able to open the New Tab")
	public void user_should_be_able_to_open_the_new_tab() {
	     
	     
	}

	@And("User should be able to open New Window")
	public void user_should_be_able_to_open_new_window() {
	     
	     
	}

	@And("User should be able to open New Window Message")
	public void user_should_be_able_to_open_new_window_message() {
	     
	     
	}
}
