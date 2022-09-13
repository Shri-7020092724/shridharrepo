package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside steps- user is no login button");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside steps- user enters usrename and password ");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("inside steps- user click the login button");
	}

	@Then("user is nevigated to the home page")
	public void user_is_nevigated_to_the_home_page() {
		System.out.println("inside steps-  user nevigated to home page");
	}



}
