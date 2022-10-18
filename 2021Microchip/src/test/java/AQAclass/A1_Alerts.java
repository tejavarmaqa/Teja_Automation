package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class A1_Alerts {

	public WebDriver driver;

	@Test
	public void handlingalerts() throws Exception {

		// click on clickme button
		driver.findElement(By.id("alertButton")).click();
		
		String str = driver.switchTo().alert().getText();
		
	System.out.println(str);
		
		Thread.sleep(3000);
			
		driver.switchTo().alert().accept();

	}

	@BeforeTest
	public void openurl() throws Exception {

		//WebDriverManager.firefoxdriver().setup();
		
		System.setProperty("webdriver.gecko.driver","D:\\Bowsers drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe\\");
		  driver = new FirefoxDriver();
		  driver.get("https://demoqa.com/alerts");
		  
			/*
			 * //Implicitly wait:Sets the time limit Throwout the program
			 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 * 
			 * //Explicit Wait Sets the time limit for Particular instance or element
			 * WebDriverWait wait = new WebDriverWait(driver, 10);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//div[contains(text(),'COMPOSE')]")));
			 */
		  
	}

	@AfterTest
	public void afterTest() {

	}

}
