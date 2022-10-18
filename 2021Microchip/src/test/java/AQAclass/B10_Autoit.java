package AQAclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.ResourceService.WelcomeFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B10_Autoit {

	public WebDriver driver;

	@Test
	public void fun() throws Exception {

		
		
		
		  WebElement ele = driver.findElement(By.id("myFile"));
		  
		  Thread.sleep(2000);
		  
		  ele.sendKeys("C:\\Users\\Charvik\\Desktop\\Ganapati.xlsx");
		  Thread.sleep(2000);
		 
		 
		 
		 
		
			
		/*
		 * WebElement ele1 = driver.findElement(By.id("myFile")); Thread.sleep(2000);
		 * ele1.click();
		 * 
		 * Runtime.getRuntime().exec("C:\\Users\\Charvik\\Desktop\\Rootwally_Autoit.exe"
		 * );
		 */
		  
			 
	}

	@BeforeTest
	public void beforeTest() throws Exception {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

	}

}
