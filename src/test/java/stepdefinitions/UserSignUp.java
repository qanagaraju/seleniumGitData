package stepdefinitions;

import io.cucumber.java.en.When;

public class UserSignUp {
	
	
	 @When("user click signup")
	 public void user_click_signup() {
		 System.out.println("user signup");
	 }
	 
	 @When("user insert mail id")
	 public void user_insert_mail_id() {
		 System.out.println("user mail id");
	 }
	 
	 @When("user insert password")
	 public void user_insert_password() {
		 System.out.println("user password");
	 }

}
