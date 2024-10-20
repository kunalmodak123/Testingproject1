package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod_19May {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.get("https://www.selenium.dev/downloads/");
		System.out.println(w.getTitle());
		Thread.sleep(2000);
		System.out.println(w.getCurrentUrl());
		w.get("https://www.selenium.dev/documentation/");
		String title = w.getTitle();
		
		String expTitle = "The Selenium Browser Automation Project | Selenium";
		
		if (title.equals(expTitle))
		{
			System.out.println("Title has been matched");
		} 
		else
		{
			System.out.println("Title match not found");
		}
		System.out.println();
		System.out.println(w.getPageSource());

	}

}
