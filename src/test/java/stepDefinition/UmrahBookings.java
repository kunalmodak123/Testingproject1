package stepDefinition;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UmrahBookings {
	public static WebDriver w;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() throws Exception {
		w = new ChromeDriver();
	}

	@Given("I navigate to umrahbookings website")
	public void i_navigate_to_umrahbookings_website() {
		w.manage().window().maximize();  
		w.get("https://umrahbookings.com/AgentLogin6.aspx");
	}

	@When("I login with username and password")
	public void i_login_with_username_and_password() {
		
	    w.findElement(By.id("txtusername")).sendKeys("kunal@puratech.in");		
	    w.findElement(By.id("txtpassword")).sendKeys("123");
	    w.findElement(By.linkText("Login")).click();
	}
	@When("I search for hotel in Makkah with checkin date as {string} and check out date as {string}")
	public void i_search_for_hotel_in_makkah_with_checkin_date_as_and_check_out_date_as(String string, String string2) {
	    WebDriverWait wt = new WebDriverWait(w, Duration.ofSeconds(5));
		WebElement dest = wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("HotelForm$dllCity")));
	    Select city = new Select(dest);
	    city.selectByValue("619");
	    w.findElement(By.id("txtCheckinDate")).sendKeys("30/03/2025");
	    w.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[3]/section/div[1]/div/div[1]")).click();
	    WebElement nights = w.findElement(By.id("ddlNoOfDays"));
	    Select nts = new Select(nights);
	    nts.selectByValue("2");
	    w.findElement(By.xpath("/html/body/form/div[3]/div[3]/section/div[1]/div/div[2]/div/div/div[3]/div[3]/button")).click();	    		
	}

	@When("I select the first hotel from the results")
	public void i_select_the_first_hotel_from_the_results() {
		WebDriverWait wt1 = new WebDriverWait(w, Duration.ofSeconds(5));
		WebElement hotel = wt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[11]/div/div[9]/div[2]/div/div[1]/div/div/div/div[2]/div/a/button")));
	    hotel.click();				
	}
	
	@When("I select the room")
	public void i_select_the_room() throws Exception  {
	    String parentwindow = w.getWindowHandle();
	    Set<String> multiwindow = w.getWindowHandles();
	    for (String child : multiwindow) {
			if (!parentwindow.equals(child)) {
				w.switchTo().window(child);
				
			    w.findElement(By.linkText("Click here to See Rate")).click();

				Thread.sleep(2000);
				w.findElement(By.xpath("//button[text()='Book']")).click();
		
				w.findElement(By.linkText("Next")).click();		
				}
	    }
	}

	@When("I fill in passenger details")
	public void i_fill_in_passenger_details() throws Exception {
		Thread.sleep(2000);
		WebElement title = w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		Select tl = new Select(title);
		tl.selectByValue("Mr.");
	    w.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Kunal");
	    w.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("Modak");
	    
	    WebElement ptp = w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[5]/div[2]/button"));
	    ((JavascriptExecutor) w).executeScript("arguments[0].scrollIntoView(true);", ptp);
	    ptp.click();
	}

	@Then("I see the payment option")
	public void i_see_the_payment_option() {
		String mainString = "Available Credit1";  // The string you want to search in
		String text = "Credit";  // The text you're looking for

		// Check if mainString contains the text
		if (mainString.equals(text)) {
		    System.out.println("String found");
		} else {
		    System.out.println("String not found");
		}

		}
	
}	
	
	
//		AppiumDriver w;
//		
//		@Given("I launch chrome browser")
//		public void i_launch_chrome_browser() throws Exception {
//		
//			DesiredCapabilities caps = new DesiredCapabilities();
//	
//			caps.setCapability("platformName", "Android");
//			caps.setCapability("appium:platformVersion", "11");
//			caps.setCapability("appium:deviceName", "Galaxy M31");
//			caps.setCapability("appium:udid", "RZ8N6027JGY");
//			caps.setCapability("browserName", "Chrome");
//			caps.setCapability("appium:automationName", "UiAutomator2");
//			caps.setCapability("appium:chromedriverExecutable", "C:\\Users\\KUNAL\\chromedriver.exe");
//			caps.setCapability("appium:newCommandTimeout", 300);
//			caps.setCapability("appium:launchTimeout", 120000);

//			URL url = new URL("http://192.168.0.109:4723/");  
//			w = new AndroidDriver(url, caps); 
//		}
//
//		@Given("I navigate to umrahbookings website")
//		public void i_navigate_to_umrahbookings_website() {
//			
//			Dimension size = w.manage().window().getSize();
//			System.out.println("Width: " + size.getWidth() + " Height: " + size.getHeight());
//		    w.get("https://umrahbookings.com/AgentLogin6.aspx");
//		}
//
//		@When("I login with username and password")
//		public void i_login_with_username_and_password() {
//		    w.findElement(By.id("txtusername")).sendKeys("kunal@puratech.in");
//		    w.findElement(By.id("txtpassword")).sendKeys("123");
//		    w.findElement(By.linkText("Login")).click();
//		}
//		@When("I search for hotel in Madinah with checkin date as {string} and check out date as {string}")
//		public void i_search_for_hotel_in_madinah_with_checkin_date_as_and_check_out_date_as(String string, String string2) {
//		    WebDriverWait wt = new WebDriverWait(w, Duration.ofSeconds(5));
//			WebElement dest = wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("HotelForm$dllCity")));
//		    Select city = new Select(dest);
//		    city.selectByValue("619");
//		    w.findElement(By.id("txtCheckinDate")).sendKeys("30/03/2025");
//		    w.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[3]/section/div[1]/div/div[1]")).click();
//		    WebElement nights = w.findElement(By.id("ddlNoOfDays"));
//		    Select nts = new Select(nights);
//		    nts.selectByValue("2");
//		    w.findElement(By.xpath("/html/body/form/div[3]/div[3]/section/div[1]/div/div[2]/div/div/div[3]/div[3]/button")).click();	    		
//		}
//
//		@When("I select the first hotel from the results")
//		public void i_select_the_first_hotel_from_the_results() {
//			WebDriverWait wt1 = new WebDriverWait(w, Duration.ofSeconds(5));
//			WebElement hotel = wt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[11]/div/div[9]/div[2]/div/div[1]/div/div/div/div[2]/div/a/button")));
//		    hotel.click();
//			
//			WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(10));
//			WebElement wt1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[11]/div/div[9]/div[2]/div/div[1]/div/div/div/div[2]/div/a/button")));
//
//			((JavascriptExecutor) w).executeScript("window.scrollTo(0, 350)");
//			wt1.click();		
//		}
//		
//		@When("I select the room")
//		public void i_select_the_room() throws Exception  {
//		    String parentwindow = w.getWindowHandle();
//		    Set<String> multiwindow = w.getWindowHandles();
//		    for (String child : multiwindow) {
//				if (!parentwindow.equals(child)) {
//					w.switchTo().window(child);
//					
//					WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(10));
//		            WebElement seeRateButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Click here to See Rate")));
//		            ((JavascriptExecutor) w).executeScript("window.scrollTo(0, 700");
//		            Thread.sleep(1000);
//		            seeRateButton.click();
	
//					Thread.sleep(2000);
//					w.findElement(By.xpath("//button[text()='Book']")).click();
//			
//					w.findElement(By.linkText("Next")).click();		
//					}
//		    }
//		}
//
//		@When("I fill in passenger details")
//		public void i_fill_in_passenger_details() throws Exception {
//			Thread.sleep(2000);
//			WebElement title = w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
//			Select tl = new Select(title);
//			tl.selectByValue("Mr.");
//		    w.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Kunal");
//		    w.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("Modak");
//		    
//		    WebElement ptp = w.findElement(By.xpath("/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[5]/div[2]/button"));
//		    ((JavascriptExecutor) w).executeScript("arguments[0].scrollIntoView(true);", ptp);
//		    ptp.click();
//		}
//
//		@Then("I see the payment option")
//		public void i_see_the_payment_option() {
//			String mainString = "Available Credit1";  // The string you want to search in
//			String text = "Credit";  // The text you're looking for
//
//			// Check if mainString contains the text
//			if (mainString.equals(text)) {
//			    System.out.println("String found");
//			} else {
//			    System.out.println("String not found");
//			}
//
//			}	
//	
	
	
	

