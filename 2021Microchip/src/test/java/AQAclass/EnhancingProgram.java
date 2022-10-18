package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;

public class EnhancingProgram {

	public WebDriver driver;

	@Test
	public void improvement() throws Exception {

		driver.findElement(By.id("firstName")).sendKeys("Raja");

		driver.findElement(By.id("lastName")).sendKeys("Ram");

		driver.findElement(By.id("userEmail")).sendKeys("rajaram@gmail.com");

		// Radiobutton
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		
	
		  driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		  Thread.sleep(30000);
		  
		  driver.findElement(By.id("subjectsInput")).sendKeys("Arts");
		  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		  
		  Thread.sleep(30000);
		  driver.findElement(By.id("subjectsInput")).sendKeys("Ecomerce");
		  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		  
		  
		  //Own writing xpat
		  driver.findElement(By.id("subjectsInput")).sendKeys("Physics");
		  driver.findElement(By.xpath("//*[normalize-space()='Physics']")).click();
		 
		 
		/*
		 * //Google Images button //driver.findElement(By.linkText("Images")).click();
		 * 
		 * 
		 * 
		 * driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		 * Thread.sleep(30000);
		 * 
		 * 
		 * //Tryed wit fed examples like creating own XPath
		 * 
		 * Thread.sleep(5000);
		 * 
		 * 
		 * driver.findElement(By.id("subjectsContainer")).sendKeys(Keys.ENTER);
		 * 
		 * Thread.sleep(5000);
		 
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"close-fixedban\"]")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * driver.findElement(By.id("state")).click();
		 * driver.findElement(By.id("state")).sendKeys("NCR"); Thread.sleep(3000);
		 * driver.findElement(By.id("state")).sendKeys(Keys.ENTER); Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		 * webelement ele1 =
		 * driver.findElement(By.xpath("//*[normalize-space()='Haryana']"));
		 * 
		 * //This will scroll the page till the element is found
		 * js.executeScript("arguments[0].scrollIntoView();", ele1);
		 * 
		 * driver.findElement(By.xpath("//*[normalize-space()='Haryana']")).click();
		 * 
		 * driver.findElement(By.id("state")).click();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //First Name driver.findElement(By.id("firstName")).sendKeys("Kaston krist");
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//*[normalize-space()='Maths']")).click();
		 * Thread.sleep(6000);
		 * 
		 * //Keyboard Enter
		 * driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		 * Thread.sleep(3000);
		 * 
		 * 
		 * driver.findElement(By.id("subjectsInput")).sendKeys("Physics");
		 * Thread.sleep(3000);
		 * 
		 * 
		 * //Keyboard Enter
		 * driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		 * Thread.sleep(3000);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * 
		 *
		 * Element = driver.findElement(By.id("state"));
		 * 
		 * //This will scroll the page till the element is found
		 * js.executeScript("arguments[0].scrollIntoView();", Element);
		 * 
		 * driver.findElement(By.id("state")).click();
		 * 
		 * driver.findElement(By.xpath("//*[normalize-space()='Haryana']")).click();
		 * 
		 * 
		 * 
		 * Screen scr = new Screen();
		 * 
		 * Pattern p2 = new
		 * Pattern("C:\\Users\\Charvik\\Desktop\\yseScreens\\Sujecttextbox.png");
		 * 
		 * Pattern p1 = new
		 * Pattern("C:\\Users\\Charvik\\Desktop\\yseScreens\\Coosefile.png");
		 * 
		 * 
		 * 
		 * scr.type(p2, "Mats");
		 * 
		 * scr.click(p1);
		 * 
		 */
	}

	@BeforeTest
	public void beforeTest() throws Exception {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

	}

}
