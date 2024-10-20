package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SauceDemo_DataDriven_Task {

	public static void main(String[] args) throws Exception {

		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("D:\\Selenium\\SauceDemo.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			
			w.manage().window().maximize();
			w.get("https://www.saucedemo.com/");
			w.findElement(By.id("user-name")).sendKeys(username.toString());
			w.findElement(By.id("password")).sendKeys(password.toString());
			w.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			try {
				w.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
				w.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			TakesScreenshot tss = (TakesScreenshot) w;
			FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\KUNAL\\eclipse-workspace\\AdvancedAutomation\\src\\test\\resources\\"+username.toString()+"   "+password.toString()+".png"));
			Thread.sleep(2000);
			
			
		
		}

	}

}
