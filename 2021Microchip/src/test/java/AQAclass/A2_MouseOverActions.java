package AQAclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class A2_MouseOverActions {
	
	public WebDriver driver;
	public Actions action;
	
	
	
  @Test
  public void MouseOvver() throws Exception {
	  
action = new Actions(driver);

WebElement ele1 = driver.findElement(By.linkText("SwitchTo"));
 
//Action command
action.moveToElement(ele1).build().perform();

Thread.sleep(3000);
	  
	  //windows
	  driver.findElement(By.linkText("Windows")).click();

	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  
  }

  
  @AfterTest
  public void afterTest() {
	  
	  
  }

}
