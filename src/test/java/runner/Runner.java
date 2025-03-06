package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\KUNAL\\eclipse-workspace\\AdvancedAutomation\\Features/UmrahBookings.feature", 
glue = "stepDefinition", 
plugin = {"pretty" , 
		"html:target/cucumber-reports/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun = false , 
monochrome = false)

public class Runner {

}
