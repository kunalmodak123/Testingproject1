package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoFrontAccountingUsingpageFactory {
WebDriver w;
	public RepoFrontAccountingUsingpageFactory(WebDriver wd) {
		w = wd;
	    PageFactory.initElements(w, this);
	}
	@FindBy(name = "user_name_entry_field") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(name = "SubmitUser") WebElement loginbtn;
	@FindBy(linkText = "Sales Quotation Entry") WebElement salesquotationentry;
	@FindBy(linkText = "Logout") WebElement logoutlink;
	
	public void openurl() 
	{
		w.get("https://demo.frontaccounting.eu/index.php");	
	}
	public void login(String usern , String passw) 
	{
		username.clear();
		username.sendKeys(usern);
		password.clear();
		password.sendKeys(passw);
		loginbtn.click();		
	}	
	public void logout() throws Exception 
	{
		salesquotationentry.click();
		Thread.sleep(2000);
		logoutlink.click();		
	}

}
