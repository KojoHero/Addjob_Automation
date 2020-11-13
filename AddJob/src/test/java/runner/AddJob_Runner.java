package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"F:\\Add_Job\\AddJob\\src\\test\\java\\AddJob\\add_Job.feature"},
//		features = {"F:\\Add_Job\\AddJob\\src\\test\\java\\AddJob\\1_TP-4.feature"},		
		glue = {"steps"},
		monochrome = true,
		tags = {},
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class AddJob_Runner extends AbstractTestNGCucumberTests{

}
