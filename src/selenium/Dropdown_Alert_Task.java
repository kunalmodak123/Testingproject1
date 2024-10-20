package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Alert_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/index.php");
		w.manage().window().maximize();
		w.findElement(By.name("SubmitUser")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("Sales Quotation Entry")).click();
		//w.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a[1]")).click();
		WebElement customer = w.findElement(By.id("customer_id"));
		Select cst = new Select(customer);
		Thread.sleep(2000);
		cst.selectByValue("121");
		Thread.sleep(2000);
		
		w.findElement(By.id("CancelOrder")).click();
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		Thread.sleep(2000);
		
		alt.dismiss();
		Thread.sleep(2000);
		
		w.findElement(By.id("CancelOrder")).click();
		Thread.sleep(2000);
		alt.accept();
	}

}
