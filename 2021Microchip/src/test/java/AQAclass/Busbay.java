package AQAclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Busbay {

	public WebDriver driver;

	@Test
  public void f() throws InterruptedException {
	  
		 driver.findElement(By.id("src")).sendKeys("Hyderabad");
		  driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		 
		  
		  driver.findElement(By.id("dest")).sendKeys("Mumbai");
		  driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		 
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[5]")).click();
		
		  //Clicking on 10t date
		  driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[3]/td[6]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("search_btn")).sendKeys(Keys.ENTER);
  }

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charvik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
