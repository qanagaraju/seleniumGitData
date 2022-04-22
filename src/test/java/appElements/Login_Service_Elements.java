package appElements;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Login_Service_Elements {
	
	
	static WebDriver driver;
	
	@FindBy(name="user") private  WebElement userName;
	@FindBy(name="pass")private WebElement password;
	@FindBy(name="btnSubmit")private WebElement loginButton;
	@FindBy(xpath="//*[@id=\"user_bar\"]/ul/li[1]/a")private WebElement Logout;
	@FindBy(id="right_col_top_err") private WebElement user_message;
	

	public Login_Service_Elements insertUserName(String un) {
		
	
		userName.sendKeys(un);
		return this;
		
	}
	
	
	public Login_Service_Elements insertPassword(String pw) {
		password.sendKeys(pw);
		return this;
	}
	
	public Login_Service_Elements clickLoginButton() {
		
		loginButton.click();
		
		
		try {
			
			String error = user_message.getText();
			System.out.println("Login Fail"+"\t"+error);
			
			
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		
		
		return this;
	}
	
	public Login_Service_Elements clickLogOut() throws InterruptedException {
		Thread.sleep(3000);
		
		if(Logout.isEnabled()) {
			Logout.click();
			Assert.assertTrue(true);
		}else
		{
			Assert.assertFalse(false);
		}
		
		
		
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
