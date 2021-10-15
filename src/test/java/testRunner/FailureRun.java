package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features  ="@target/rerun.txt",

		glue = "stepDefinitions", monochrome = true, dryRun = false,

		plugin = { "pretty", 
				
				"html:reports/myreport.html", 
				
		
		}

)

public class FailureRun {

}
