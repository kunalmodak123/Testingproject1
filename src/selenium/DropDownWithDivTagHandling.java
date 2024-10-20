package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithDivTagHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.findElement(By.name("username")).sendKeys("Admin");
		w.findElement(By.name("password")).sendKeys("admin123");
		w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		w.findElement(By.linkText("PIM")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
		List<WebElement> Employmentstatus = w.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div"));
		for (WebElement Status : Employmentstatus) 
		{
			if (Status.getText().equals("Full-Time Permanent")) 
			{
				Status.click();
				break;		
			}	
		}
		
		w.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
		List<WebElement> Include = w.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div"));
		for (WebElement Includes : Include) 
		{
			if (Includes.getText().equals("Current and Past Employees")) 
			{
				Includes.click();
				break;		
			}	
		}
		
		w.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
		List<WebElement> jobtitles = w.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div"));
		for (WebElement Title : jobtitles) 
		{
			if (Title.getText().equals("IT Manager")) 
			{
				Title.click();
				break;			
			}		
		}
		
		w.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[2]/i")).click();
		List<WebElement> subunit = w.findElements(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div[2]/div"));
		for (WebElement Unit : subunit) 
		{
			if (Unit.getText().equals("Quality Assurance")) 
			{
				Unit.click();
				break;		
			}
			
		}
	}

}
