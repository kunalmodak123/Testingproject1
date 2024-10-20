package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo {
	
	WebDriver w;
	@Given("SauceDemo site open in chromebrowser")
	public void sauce_demo_site_open_in_chromebrowser() {
	    w = new ChromeDriver();
	    w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    w.get("https://www.saucedemo.com/v1/index.html");
	}

	@When("enter standard_user value in username field.")
	public void enter_standard_user_value_in_username_field() {
		w.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("enter secret_sauce value in password field.")
	public void enter_secret_sauce_value_in_password_field() {
	    w.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("user should be login to sauce demo.")
	public void user_should_be_login_to_sauce_demo() {
	    w.findElement(By.id("login-button")).click();
	}

	@Then("user should be logout from sauce demo.")
	public void user_should_be_logout_from_sauce_demo() {
	    w.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/button")).click();
	    w.findElement(By.linkText("Logout")).click();
	}

	@Then("validate whether user is logged out and login page is displayed.")
	public void validate_whether_user_is_logged_out_and_login_page_is_displayed() {
	    
		String login = w.findElement(By.id("login-button")).getAttribute("value");
		Assert.assertEquals("LOGIN", login);
	}

}
