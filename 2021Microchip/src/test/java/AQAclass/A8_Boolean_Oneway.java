package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A8_Boolean_Oneway {
	
	public WebDriver driver;
	
  @Test
  public void options() throws Exception {
	  
	  
	  //Switching to Roundtrip
	  driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).click();
	  Thread.sleep(3000);
		
		  //Print Condition True or False 
	  Boolean printcondition = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]")).isDisplayed();
		  
		  System.out.println(printcondition);
		 
	
	WebElement ele1 = driver.findElement(By.xpath("//button[contains(text(),'Round Trip')]"));
	
	if (ele1.isEnabled()) {
		
		System.out.println("Round trip is tere passed");
		
	} else {
		
		System.out.println("No Not available");

	}
  }
  
  
  @BeforeTest
  public void beforeTest() {
	 
	  
	  WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	  driver.get("https://savaari.com/");
	  driver.manage().window().maximize();
	  
  }

  

@AfterTest
  public void afterTest() {
	  
  }

}
