package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandling_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new FirefoxDriver();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.manage().window().maximize();
		w.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		Thread.sleep(2000);
		
		alt.dismiss();
		Thread.sleep(2000);
		
		w.findElement(By.xpath("/html/body/div[2]/div[3]/fieldset/input[3]")).click();
		Thread.sleep(2000);
		String info = alt.getText();
		System.out.println(info);
		
		alt.accept();
		
		w.close(); //closes instance of tab
		//w.quit -- closes entire browser
		

	}

}
