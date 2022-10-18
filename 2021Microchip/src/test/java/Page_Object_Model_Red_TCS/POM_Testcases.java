package Page_Object_Model_Red_TCS;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Object_Model_Red.PageFactory;
import Page_Object_Model_Red.RedffiLoginPage;

public class POM_Testcases {
	
	@Test
	public void Login()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charvik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		RedffiLoginPage rd = new RedffiLoginPage(driver); 
		rd.Username().sendKeys("admin");
		rd.Password().sendKeys("Admin");
		rd.Go().click();
		
		PageFactory pf =new  PageFactory(driver);
		pf.User().sendKeys("admin");
		pf.Pass().sendKeys("admin");
		pf.Login().click();
		
	}

}
