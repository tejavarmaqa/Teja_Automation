package C24_IOput_Iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

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
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Input_OutPut_Streams {
	
	
	public WebDriver driver;
	public String str;
 
  
  
  @Test
  public void functionality() throws Exception{
	  
//Read the data from the input file	  
FileInputStream fi = new FileInputStream("D:\\Personal_swamykumar\\Test Data\\HMS_Data_DrivenLogin.xls");
	  Workbook w = Workbook.getWorkbook(fi);
	  Sheet s = w.getSheet("MTC");


//Create the result file under the result folder		  
FileOutputStream fo = new FileOutputStream("D:\\Personal_swamykumar\\Test Data\\Sairamoutput\\sindu.xls");
	  WritableWorkbook wb = Workbook.createWorkbook(fo);
	  WritableSheet ws = wb.createSheet("Results", 0);
	
	  
	  
for (int i = 1; i < s.getRows(); i++) {

//Enter username,Password and click on signin by taking data from input file
driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
Thread.sleep(3000);

driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);

//Validate singout, if available assign pass to str, else assign fail to str
try{
	
driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]")).click();	
	
driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

	Thread.sleep(6000);
	String str="Pass";
	System.out.println(str);
	
	
}catch(Exception e)
{
	String str="Fail";
	System.out.println(str);

}


//Add str value to the result file under result column
jxl.write.Label result = new jxl.write.Label(2, i, str);
ws.addCell(result);


//Add input data to the result file
for (int j = 0; j < s.getColumns(); j++) {
	
	System.out.println(s.getCell(j, i).getContents());
	jxl.write.Label l = new jxl.write.Label(j, i, s.getCell(j, i).getContents());
	ws.addCell(l);
	
	
}
	
}
//Add the heading
jxl.write.Label un = new jxl.write.Label(0,0,"Username");
jxl.write.Label pw = new jxl.write.Label(1,0,"Password");
jxl.write.Label rs = new jxl.write.Label(2, 0, "Results");
	ws.addCell(un);
	ws.addCell(pw);
	ws.addCell(rs);

	//Write and close the result file	
		wb.write();
		wb.close();

  }

  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
