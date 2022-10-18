package AQAclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A7_INR_optionsvalidation {

	public WebDriver driver;

	@Test
  public void options() {
		
List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();

System.out.println(allvalues.get(4).getText());


//Print all values from A to Z(Starting to ending)
for (int i = 0; i < allvalues.size(); i++) {
  
  System.out.println(allvalues.get(i).getText());
  
  //Checking comparision with equalIgnoreCase or Contains(ValidationProspective) 
if (allvalues.get(i).getText().contains("28")) {
  
  System.out.println(allvalues.get(i).getText());
  System.out.println("Its passed 28");
  
  
  
  }

  }
	}
 

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "D:\\Rajasthan Singar\\geckodriver.exe");
		  driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		
		

}
}
