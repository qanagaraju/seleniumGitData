package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import AppService_Utilities.PropertyLoader;
import Config.BrowserDriver;
import appElements.Login_Service_Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Service 
{
   
   static WebDriver driver;
  
  
   public PropertyLoader reader = new PropertyLoader();
   Login_Service_Elements login;
 
   
   
		@Given("user start home page")
		public void user_start_home_page() {
		    
			
			
		}
		
		
		 @When("user insert username and password")
		public void user_insert_username_and_password(){
			
			login = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Login_Service_Elements.class);
			 
			login.insertUserName(reader.get_username());
			login.insertPassword(reader.get_password());
		}
		 
		 

		@Then("user click login button")
		public void user_click_login_button() {
		
			login.clickLoginButton();
			
		}
		
		
		@Then("user click logout")
		public void user_click_logout() throws InterruptedException {
			
			login.clickLogOut();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
