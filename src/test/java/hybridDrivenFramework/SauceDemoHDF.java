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
import org.openqa.selenium.firefox.FirefoxDriver;

import keyDrivenFramework.RepoSauceDemo;

public class SauceDemoHDF {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("D:\\Selenium\\SauceDemoHDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		XSSFSheet sheet2 = work.getSheet("Sheet2");
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			XSSFCell firstname = row.getCell(2);
			XSSFCell lastname = row.getCell(3);
			XSSFCell zipcode = row.getCell(4);
			DataFormatter dataf = new DataFormatter();
			String zip = dataf.formatCellValue(zipcode);
			String first = dataf.formatCellValue(firstname);
			String last = dataf.formatCellValue(lastname);
			for(int j=1;j<=sheet2.getLastRowNum();j++) 
			{
				XSSFRow row1 = sheet2.getRow(j);
				XSSFCell TestStep = row1.getCell(0);
				RepoSauceDemoHDF rsd = new RepoSauceDemoHDF(w);
				switch (TestStep.toString()) 
				{
				case "openurl":
					w.manage().window().maximize();
					rsd.openurl("https://www.saucedemo.com/v1/index.html");			
					break;
				case "login":
					rsd.login(username.toString(), password.toString());		
					break;
				case "productone":
					try 
					{
						rsd.addProduct1();
						break;
					} catch (Exception e) 
					{					
					}
				case "producttwo":
					try 
					{
						rsd.addProduct2();
						break;						
					} catch (Exception e)
					{					
					}
				case "cart":
					try 
					{
						rsd.opencart();	
						break;		
					} catch (Exception e)
					{					
					}
				case "checkout":
					try 
					{
						rsd.checkout();		
						break;				
					} catch (Exception e) 
					{						
					}
					
				case "yourinfo":
					try 
					{
						rsd.yourinfo(firstname.toString(), lastname.toString() , zip);		
						break;	
					} catch (Exception e) 
					{
					
					}
				case "overview":
					try 
					{
						rsd.overview();			
						break;	
					} catch (Exception e) 
					{
					
					}
				case "logout":
					try 
					{
						rsd.logout();		
						break;	
					} catch (Exception e) 
					{
					
					}

				default:
					System.out.println("Defect");
					break;
				}
			}
		}
				
	}
}
