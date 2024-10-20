package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccountingPagefactory {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		RepoFrontAccountingUsingpageFactory fa = new RepoFrontAccountingUsingpageFactory(w);
		w.manage().window().maximize();
		fa.openurl();
		fa.login("demouser", "password");
		fa.logout();
	}

}
