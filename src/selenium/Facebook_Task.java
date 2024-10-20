package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.google.com/search?q=facebook&sca_esv=905151fc136a1efd&source=hp&ei=NhSBZtaGH8KZ4-EPx5u1mAM&iflsig=AL9hbdgAAAAAZoEiRuWwvpVNYBIXUOMME0IMq4g_xJyp&ved=0ahUKEwjW-bK18YKHAxXCzDgGHcdNDTMQ4dUDCA0&uact=5&oq=facebook&gs_lp=Egdnd3Mtd2l6IghmYWNlYm9vazIREC4YgAQYsQMY0QMYgwEYxwEyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMggQABiABBixAzIIEAAYgAQYsQMyCBAAGIAEGLEDMgsQABiABBixAxiDATILEAAYgAQYsQMYgwFIzRNQzQVYvg5wAXgAkAEAmAGLAqAB0QuqAQUwLjYuMrgBA8gBAPgBAZgCCaACjAyoAgrCAhAQABgDGOUCGOoCGIwDGI8BwgIQEC4YAxjlAhjqAhiMAxiPAcICDhAAGIAEGLEDGIMBGIoFwgILEC4YgAQYsQMYgwHCAggQLhiABBixA8ICBRAAGIAEwgILEC4YgAQY0QMYxwHCAgUQLhiABJgDCpIHBTEuNS4zoAfzQg&sclient=gws-wiz");
	    w.findElement(By.linkText("Facebook")).click();
	    Thread.sleep(2000);
	    
	    
	    
//	    String parentwinidow = w.getWindowHandle();
//		System.out.println("parent window "+parentwinidow);
//		Set<String> multiwondow = w.getWindowHandles();
//		System.out.println("multi wondow "+multiwondow);
//		
//		for (String child : multiwondow) 
//		{
//			if (!parentwinidow.equals(child)) 
//			{
//				w.switchTo().window(child);
//				Thread.sleep(2000);
//				w.findElement(By.linkText("Create new account")).click();
//			}
//		}
//		
//	    w.findElement(By.linkText("Create new account")).click();
		

	}

}
