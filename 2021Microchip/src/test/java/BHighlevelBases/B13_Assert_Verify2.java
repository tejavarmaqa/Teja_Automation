package BHighlevelBases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.thread.TryExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B13_Assert_Verify2 {

	public WebDriver driver;

	@Test
	public void fun() {

		// correct title is "Software Testing Material - Free Software Testing &
		// Development Material"
		// We want to make title as "Material" to make the test fail

		/*
		 * String ActualTitle = "Material"; String ExpectedTitle = driver.getTitle();
		 */

		String actualtitle = "$3";
		String expectedvalue = driver.findElement(By.xpath("//b[contains(text(),'$398')]")).getText();
		System.out.println(expectedvalue);

		
		// 1st statement
		System.out.println("Assertion starts here...");
		
	
		  try{
		 

				Assert.assertEquals(actualtitle, expectedvalue);

				
		
		  }
		  
		  catch (Throwable t){
		  
			// 2nd statement
				System.out.println("Apple");

				// 3rd statement
				System.out.println("A blog for Software Testers");
		  
		  
		  }
		 

		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("https://www.softwaretestingmaterial.com");
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
	}

}
