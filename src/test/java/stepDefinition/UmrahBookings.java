package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UmrahBookings {
	WebDriver w;
	@Given("launch chromebrowser in new tab")
	public void launch_chromebrowser_in_new_tab() {
		w = new ChromeDriver();
	}

	@Given("navigate to https:\\/\\/umrahbookings.com\\/")
	public void navigate_to_https_umrahbookings_com() {
		w.manage().window().maximize();
	    w.get("https://umrahbookings.com/");
	}

	@When("enter kunal@puratech.in value in username field.")
	public void enter_kunal_puratech_in_value_in_username_field() {
	    w.findElement(By.id("txtusername")).sendKeys("kunal@puratech.in");
	}
	@When("enter {int} value in password field.")
	public void enter_value_in_password_field(Integer int1) {
	    w.findElement(By.id("txtpassword")).sendKeys("123");
	}
	
	@When("user should be login to umrah bookings.")
	public void user_should_be_login_to_umrah_bookings() {
	    w.findElement(By.xpath("/html/body/form/div[4]/div/div/div/div[1]/div[2]/div[4]/a")).click();
	}

	@Then("make a hotel search")
	public void make_a_hotel_search() throws Exception {
	    WebElement destination = w.findElement(By.xpath("/html/body/form/div[3]/div[3]/section/div[1]/div/div[2]/div/div/div[2]/div[2]/div/select"));
		Select des = new Select(destination);
		Thread.sleep(2000);
		des.selectByValue("619");
		Thread.sleep(2000);
		w.findElement(By.id("txtCheckinDate")).sendKeys("31/10/2024");
		w.findElement(By.id("txtCheckOutDate")).sendKeys("01/11/2024");
		w.findElement(By.id("divbtnSearch")).click();
	}
}

//	@Then("select hotel hotel to book")
//	public void select_hotel_hotel_to_book() {
//	    
//	}
//
//	@Then("click on book")
//	public void click_on_book() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//}
