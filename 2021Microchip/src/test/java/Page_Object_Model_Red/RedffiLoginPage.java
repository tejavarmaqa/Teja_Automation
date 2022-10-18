package Page_Object_Model_Red;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedffiLoginPage {

	WebDriver driver;
	public RedffiLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.id("login1");
	By password=By.id("password");
	By go=By.name("proceed");
	
	public WebElement Username() {
		
		return driver.findElement(username);
	}
	
    public WebElement Password() {
		
		return driver.findElement(password);
	}

    public WebElement Go() {
		
		return driver.findElement(go);
	}

	}


