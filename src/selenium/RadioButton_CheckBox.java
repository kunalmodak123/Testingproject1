package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_CheckBox {

	public static void main(String[] args) throws Exception {

		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		//findelement used to handle single checkbox
		//w.findElement(By.id("checkBoxOption1")).click();
		//findelements used to multiple single checkbox
		List<WebElement> checkbox =  w.findElements(By.xpath("/html/body/div[1]/div[4]/fieldset/label/input"));
		//List<WebElement> checkbox =  w.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for (WebElement ch : checkbox) 
		{
			ch.click();
			Thread.sleep(2000);
			
		}
		
		//w.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[1]/input")).click();
		List<WebElement> radiobutton =  w.findElements(By.xpath("/html/body/div[1]/div[1]/fieldset/label/input"));
		//List<WebElement> checkbox =  w.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for (WebElement rb : radiobutton) 
		{
			rb.click();
			Thread.sleep(2000);
			
		}
		
		

	}

}
