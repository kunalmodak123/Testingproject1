package hybridDrivenFramework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoFlipkartHDF_Task {
	WebDriver w;
	public RepoFlipkartHDF_Task(WebDriver wd)
	{
		w=wd;
		PageFactory.initElements(w, this);
	}
	//Search Element
	@FindBy (name = "q") WebElement searchproduct;
	@FindBy (className = "MJG8Up") WebElement searchbutton;
	//Selectproduct element
	@FindBy (linkText = "Boult Drift+ Bluetooth Calling, 1.85\" HD, 500Nits Brigh...") WebElement product1;
	//Add to Cart element
	@FindBy (css = "button[class=\"QqFHMw vslbG+ In9uk2\"]") WebElement addtocart;
	
	public void openurl(String url) 
	{
		w.get(url);		
	}
	public void search(String search) 
	{
		searchproduct.sendKeys(search);
		searchbutton.click();
	}
	public void selectproduct() 
	{
		product1.click();		
	}
	public void addtocart() 
	{
		addtocart.click();		
	}
 

}
