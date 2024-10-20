package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver w;
	
	@Given("FrontAccounting site open in chromebrowser")
	public void front_accounting_site_open_in_chromebrowser() {
	    w = new ChromeDriver();
	    w.get("https://demo.frontaccounting.eu/index.php");
	}

	@When("enter demouser value in username field.")
	public void enter_demouser_value_in_username_field() {
	    w.findElement(By.name("user_name_entry_field")).clear();
	    w.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
	}

	@When("enter password value in password field.")
	public void enter_password_value_in_password_field() {
	    w.findElement(By.name("password")).clear();
	    w.findElement(By.name("password")).sendKeys("password");
	}

	@Then("user should be login.")
	public void user_should_be_login() {
	    w.findElement(By.name("SubmitUser")).click();	    
	}
	
	@Then("validate whether user is login or not by checking sales quotation entry.")
	public void validate_whether_user_is_login_or_not_by_checking_sales_quotation_entry() {
	    String sales = w.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[1]")).getText();
	    Assert.assertEquals("Sales Quotation Entry", sales);
		
	}

}
