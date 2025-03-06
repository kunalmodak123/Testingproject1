package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TutorialPoint_Practise {
	WebDriver w;
	
	@Given("I am on a demo registration page")
	public void i_am_on_a_demo_registration_page() {
		w = new EdgeDriver();
		w.manage().window().maximize();
		w.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}

	@When("I enter valid details as a user")
	public void i_enter_valid_details_as_a_user() {
		w.findElement(By.id("name")).sendKeys("Rahull Agarwall");
		w.findElement(By.id("email")).sendKeys("rahul1@mailinator.com");
		
		w.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/div/div/div[1]/input")).click();
		
		w.findElement(By.id("mobile")).sendKeys("8884512548");
		
		w.findElement(By.id("dob")).sendKeys("12-10-1992");
		
		w.findElement(By.id("subjects")).sendKeys("Automation, API, SQL");
		
		WebElement filepath = w.findElement(By.id("picture"));
		filepath.sendKeys("C:\\Users\\KUNAL\\Pictures\\image1.jpeg");
		
		w.findElement(By.cssSelector("textarea[placeholder=\"Currend Address\"]")).sendKeys("Ghatkopar-W, Mumbai");
		
		WebElement state = w.findElement(By.id("state"));
		Select st = new Select(state);
		st.selectByValue("Rajasthan");
		
		WebElement city = w.findElement(By.id("city"));
		Select ct = new Select(city);
		ct.selectByValue("Agra");
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		w.findElement(By.cssSelector("input[value=\"Login\"]")).click();
	}

//	@Then("I want to see registration complete message")
//	public void i_want_to_see_registration_complete_message() {
//	    System.out.println("Registration successful");
//	}
	
}
