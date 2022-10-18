package Page_Object_Model_Red;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {
	
	WebDriver driver;
	public PageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	private static void initElements(WebDriver driver2, PageFactory pageFactory) {
		// TODO Auto-generated method stub
		
	}
	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	public WebElement User()
	{
		return username;
	}

	public WebElement Pass()
	{
		return password;
	}
	
	public WebElement Login()
	{
		return go;
	}
	
}
