package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		RepoSauceDemoUsingPageFactory sd = new RepoSauceDemoUsingPageFactory(w);
		w.manage().window().maximize();
		sd.openurl();
		sd.login("standard_user", "secret_sauce");
		sd.logout();		
	}
}
