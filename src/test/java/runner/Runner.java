package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "SauceDemo.feature" , glue = "SauceDemo.java" , dryRun = true , monochrome = true)

public class Runner {

}
