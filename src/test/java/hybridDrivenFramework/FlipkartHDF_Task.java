package hybridDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHDF_Task {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("D:\\Selenium\\FlipkartHDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		XSSFSheet sheet2 = work.getSheet("Sheet2");
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell search = row.getCell(0);		
			for(int j=1;j<=sheet2.getLastRowNum();j++) 
			{
				XSSFRow row1 = sheet2.getRow(j);
				XSSFCell TestStep = row1.getCell(0);
				RepoFlipkartHDF_Task rsd = new RepoFlipkartHDF_Task(w);
				switch (TestStep.toString()) 
				{
				case "openurl":
					w.manage().window().maximize();
					rsd.openurl("https://www.flipkart.com/");			
					break;
				case "search":
					rsd.selectproduct();
					break;
				case "productone":
					rsd.selectproduct();
				case "cart":
					rsd.addtocart();
				default:
					System.out.println("Defect");
					break;
				}
			}
		}
				
	}

	}


