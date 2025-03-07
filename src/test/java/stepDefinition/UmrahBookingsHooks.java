package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class UmrahBookingsHooks {

    @Before(order = 1)
    public void beforeScenario(Scenario scenario) {
        System.out.println("===== Starting Scenario: " + scenario.getName() + " =====");
    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {
        System.out.println("Starting Step: " + scenario.getStatus());
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        System.out.println("Finished Step: " + scenario.getStatus());

        // Take screenshot if step fails
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) UmrahBookings.w;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Step Screenshot");
            
            System.out.println("Screenshot taken for failed step: " + scenario.getName());
        }
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        System.out.println("===== Ending Scenario: " + scenario.getName() + " =====");
    }
}