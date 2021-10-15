package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"/Users/yemioluv/eclipse-workspace/guru99Demo/Feature/Login.feature"},
		//features= {"/Users/yemioluv/eclipse-workspace/guru99Demo/Feature/NewCustomer.feature"},
		
		glue = "stepDefinitions", 
		monochrome = true, 
		dryRun = false,
		
				plugin= {
						 "pretty", "html:reports/myreport.html",
							"rerun:target/rerun.txt", //To capture failures

				 }
		
		
		
		
		
		
		
		
		)







public class TestRunner {

}
