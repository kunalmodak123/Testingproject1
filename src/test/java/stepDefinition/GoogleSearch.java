package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver w;	
	@Given("launch chrome browser")
	public void launch_chrome_browser() {
	 w = new ChromeDriver();
	}

	@Given("navigate to https:\\/\\/www.google.com\\/")
	public void navigate_to_https_www_google_com() {
	 w.get("https://www.google.com/");
	}

	@When("search the {string}")
	public void search_the(String string) {
	 w.findElement(By.id("APjFqb")).sendKeys(string,Keys.ENTER);	    
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
	 Assert.assertEquals(string, w.getTitle());  
	}
}
