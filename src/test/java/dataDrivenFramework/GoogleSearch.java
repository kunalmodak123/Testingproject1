package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		//used for reading
		FileInputStream fis = new FileInputStream("D:\\Selenium\\GoogleSearch.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for(int i=1; i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell search = row.getCell(0);
			
			w.manage().window().maximize();
			w.get("https://google.com/");
			Thread.sleep(2000);
			w.findElement(By.id("APjFqb")).sendKeys(search.toString(),Keys.ENTER);
		}

	}

}
