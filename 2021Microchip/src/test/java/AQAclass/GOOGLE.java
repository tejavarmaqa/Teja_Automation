package AQAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GOOGLE {
	
	public WebDriver driver;
	
	
@Test(priority = 1)
public void Dolo() {
	  
	  
  }
  
 @Test(priority = 2)
public void AntiB() {
	  
	  
  }
  
@Test(priority = 3)
public void Cetzen() {
	  
	  
}
  
  
  @BeforeTest
  public void beforeTest() {
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charvik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
		  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
