package keyDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoSauceDemo {
    WebDriver w;
	public RepoSauceDemo(WebDriver wd) 
	{
		w = wd;
		PageFactory.initElements(w, this);
	}
// Login element
	@FindBy (id = "user-name") WebElement username;
	@FindBy (name = "password") WebElement password;
	@FindBy (css = "input#login-button[value=\"LOGIN\"]") WebElement loginbtn;
// Add to Cart element
	@FindBy (xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button") WebElement product1;
	@FindBy (xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button") WebElement product2;
	@FindBy (css = "svg[data-icon=\"shopping-cart\"]") WebElement cart;
// Checkout  
	@FindBy (partialLinkText = "CHECKOUT") WebElement checkoutbtn;
// Your Info
	@FindBy (id = "first-name") WebElement firstname;
	@FindBy (id = "last-name") WebElement lastname;
	@FindBy (id = "postal-code") WebElement zipcode;
	@FindBy (css = "input[value=\"CONTINUE\"]") WebElement continuebtn;
// Overview
	@FindBy (linkText = "FINISH") WebElement finishbtn;
// Logout
	@FindBy (xpath = "//*[@class=\"bm-burger-button\"]/button") WebElement openmenu;
	@FindBy (linkText = "Logout") WebElement logoutbtn;
	
	public void openurl(String url) 
	{
		w.get(url);
	}
	public void login(String user , String pass) throws Exception 
	{
		username.sendKeys(user);
		Thread.sleep(2000);
		password.sendKeys(pass);
		Thread.sleep(2000);
		loginbtn.click();		
	}
	public void addProduct1() throws Exception 
	{
		Thread.sleep(2000);
		product1.click();
	}
	public void addProduct2() throws Exception 
	{
		Thread.sleep(2000);
		product2.click();
	}
	public void opencart() throws Exception 
	{
		Thread.sleep(2000);
		cart.click();
	}
	public void checkout() throws Exception 
	{
		Thread.sleep(2000);
		checkoutbtn.click();
	}
	public void yourinfo(String first , String last , String zip) throws Exception 
	{
		Thread.sleep(2000);
		firstname.sendKeys(first);
		Thread.sleep(2000);
		lastname.sendKeys(last);
		Thread.sleep(2000);
		zipcode.sendKeys(zip);
		Thread.sleep(2000);
		continuebtn.click();
	}
	public void overview() throws Exception 
	{
		Thread.sleep(2000);
		finishbtn.click();
	}
	public void logout() throws Exception 
	{
		Thread.sleep(2000);
		openmenu.click();
		Thread.sleep(2000);
		logoutbtn.click();		
	}
}
