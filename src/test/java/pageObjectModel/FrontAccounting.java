package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccounting {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		RepoFrontAccounting fa = new RepoFrontAccounting(w);
		fa.openurl();
		fa.login("demouser","password");
		fa.logout();
	}

}
