package BHighlevelBases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class B18_DataDriven {

	public WebDriver driver;

	@Test
	public void data() throws Exception, Exception {
		
		FileInputStream fi = new FileInputStream("D:\\Personal_swamykumar\\Test Data\\Power.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s = wb.getSheet("Gmail");
	
		

		driver.findElement(By.id("login_field")).sendKeys(s.getCell(0, 1).getContents());
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("password")).sendKeys(s.getCell(1, 1).getContents());

		Thread.sleep(10000);

		driver.findElement(By.name("commit")).click();
		
		
	}

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://github.com/login?return_to=%2Flogins");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

	}

}
