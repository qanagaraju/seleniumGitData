package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resource\\AppFeatures\\login.feature"},
		glue= {"stepdefinitions","AppHooks"},
		dryRun = false,
		monochrome=false,
		
		stepNotifications = true,
		//tags = "@Test3 or @Test1"
				//plugin = { "pretty", "html:target/cucumber-reports" }
				//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"}
				//plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish = true
		
		
		)		


public class MyTestRunner   {

}






