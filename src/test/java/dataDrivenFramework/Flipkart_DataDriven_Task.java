package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_DataDriven_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");	
		FileInputStream fis = new FileInputStream("D:\\Selenium\\FlipkartSearch.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFCell search = sheet.getRow(i).getCell(0);
			Thread.sleep(2000);
			
			w.findElement(By.name("q")).clear();
			Thread.sleep(2000);
			w.findElement(By.name("q")).sendKeys(search.toString(),Keys.ENTER);
			Thread.sleep(2000);
			
			System.out.println(search.toString());
			
			if (search.toString().equals("GoPro"))
			{
				Thread.sleep(2000);
				w.findElement(By.partialLinkText("GoPro HERO8 Black Sports and Action Camera")).click();			
			} else if (search.toString().equals("Ps5")) {
				Thread.sleep(2000);
				w.findElement(By.partialLinkText("SONY PlayStation 5 console 825 GB")).click();
			}

			String parent = w.getWindowHandle();
			Set<String> child = w.getWindowHandles();
			for (String ch : child) 
			{
				if (!ch.equals(parent)) 
				{
					w.switchTo().window(ch);
					Thread.sleep(2000);
					w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]")).click();
					Thread.sleep(2000);
					if (!search.toString().equals("Ps5"))
					{
						w.close();
						w.switchTo().window(parent);
					}
				}	
			}		
		}
	}	
}
