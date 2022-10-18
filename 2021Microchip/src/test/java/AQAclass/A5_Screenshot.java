package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class A5_Screenshot {

	public WebDriver driver;

	@Test
	public void alertscreen() throws Exception {

		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);

		String str = driver.switchTo().alert().getText();

		System.out.println(str);

		Thread.sleep(3000);
	
		driver.switchTo().alert().accept();
		
		String ATM = "APPL";
	     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\ARSCreens\\"+ATM+".png"));



		

	}

	@BeforeTest
	public void beforeTest() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");	 
		

		String ATM = "BT";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\Charvik\\Desktop\\Sindu\\screens\\"+ATM+".png"));
		
		
	}

	@AfterTest
	public void afterTest() throws Exception {
				
String ATM = "AT";
		
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\Charvik\\Desktop\\Sindu\\screens\\"+ATM+".png"));


	}

}
