package testNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

public class UmrahBookings{
     WebDriver w;
     
     @BeforeSuite
     public void beforeSuite() {
         System.out.println("===== Test Suite Started =====");
     }

    @Parameters("browser")
    @BeforeClass
    public void OpenBrowser(String browser) {
		if (browser.equals("chrome")) 
		{
			w = new ChromeDriver();			
		} else if (browser.equals("edge")) 
		{
			w = new EdgeDriver();			
		}

        w.manage().window().maximize();
    }
    
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("===== Starting Test Method =====");
    }

    @Test(priority = 1)
    public void launchWebsite() {
        w.get("https://umrahbookings.com/AgentLogin6.aspx");
    }

    @Test(priority = 2)
    public void login() {
        w.findElement(By.id("txtusername")).sendKeys("kunal@puratech.in");
        w.findElement(By.id("txtpassword")).sendKeys("123");
        w.findElement(By.linkText("Login")).click();
    }

    @Test(priority = 3)
    public void searchHotel(){
        WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(5));
        WebElement dest = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("HotelForm$dllCity")));
        Select city = new Select(dest);
        city.selectByValue("619");

        w.findElement(By.id("txtCheckinDate")).sendKeys("30/03/2025");
        w.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[3]/section/div[1]/div/div[1]")).click();

        WebElement nights = w.findElement(By.id("ddlNoOfDays"));
        Select nts = new Select(nights);
        nts.selectByValue("2");

        w.findElement(By.xpath("/html/body/form/div[3]/div[3]/section/div[1]/div/div[2]/div/div/div[3]/div[3]/button")).click();
    }

    @Test(priority = 4,dependsOnMethods = "searchHotel")
    public void selectFirstHotel() {
        WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(5));
        WebElement hotel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div[3]/div[3]/div/div/div[11]/div/div[9]/div[2]/div/div[1]/div/div/div/div[2]/div/a/button")));
        hotel.click();
    }
    
    
    @Test(priority = 5)
    public void selectRoom() throws InterruptedException {
        String parentWindow = w.getWindowHandle();
        Set<String> multiWindows = w.getWindowHandles();

        for (String child : multiWindows) {
            if (!parentWindow.equals(child)) {
                w.switchTo().window(child);
                w.findElement(By.linkText("Click here to See Rate")).click();
                Thread.sleep(2000);
                w.findElement(By.xpath("//button[text()='Book']")).click();
                w.findElement(By.linkText("Next")).click();
            }
        }
    }

    @Test(priority = 6)
    public void fillPassengerDetails() throws InterruptedException {
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

    @Test(priority = 7)
    public void verifyPaymentOption() {
        String mainString = "Available Credit1";
        String text = "Credit";

        if (mainString.equals(text)) {
            System.out.println("Payment option verified: " + text);
        } else {
            System.out.println("Payment option not found");
        }
    }
    
    @AfterMethod
    public void afterMethod(ITestResult result) {
        System.out.println("===== Finishing Test Method =====");
    }
    
    @AfterClass
    public void teardown() {
    System.out.println("===== Closing Browser =====");
    if (w != null) {
        w.quit();
    }
    }
    
    @AfterSuite
    public void afterSuite() {
        System.out.println("===== Test Suite Finished =====");
    }
    
    
    
}    