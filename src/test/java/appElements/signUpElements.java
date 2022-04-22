package appElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signUpElements {
	
	
	@FindBy(xpath = "//*[@id=\"right_col_middle\"]/a") private WebElement signup;
	public void verifySignup() {
		
		signup.click();
	}

}
