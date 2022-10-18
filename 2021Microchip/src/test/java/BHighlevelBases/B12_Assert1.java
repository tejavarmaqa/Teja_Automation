package BHighlevelBases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B12_Assert1 {
	
	public WebDriver driver;
	
  @Test
  public void fun() {
	  
	  
	//Correct title is "Welcome: Mercury Tours" 
	  
	//We taking title as "Mercury Tours" to make the test fail
	  
	  
	
	  String Actualtitle = "Mercury Tours";
	  String Expectedtitle = driver.getTitle();
	 

	/*
	 * String actualtitle = "$398"; String expectedvalue =
	 * driver.findElement(By.xpath("//b[contains(text(),'$398')]")).getText();
	 * System.out.println(expectedvalue);
	 */
	  
	  //1st Statement 
		//Assert.assertEquals(actualtitle, expectedvalue);
	  
	  Assert.assertEquals(Actualtitle, Expectedtitle);
	  
	  //2nd statement
	  System.out.println("Assertion starts here...");
	  
	  //3nd Statement
	  System.out.println("A blog for Software Testers");
	  
	  driver.quit(); 
	               
	                 
	  }
	 
	  
  
  @BeforeTest
  public void beforeTest() {
	  
	WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
