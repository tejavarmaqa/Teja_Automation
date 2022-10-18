
  package BHighlevelBases;
  
  import java.util.List;
  
  import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
  org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.firefox.FirefoxDriver; import
  org.testng.annotations.AfterTest; import org.testng.annotations.BeforeTest;
  import org.testng.annotations.Test;
  
  import io.github.bonigarcia.wdm.WebDriverManager;
  
  public class B17_Ajaxcontrol {
  
  public WebDriver driver;
  
  @Test public void clickable() throws Exception {
  
  driver.findElement(By.name("q")).sendKeys("selenium");
  
  Thread.sleep(3000); 
  String str = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul")).getText();
  Thread.sleep(3000);
  
  String a[] = str.split("\n");
  
  for (int i = 0; i < a.length; i++) {
  
  if (a[i].equalsIgnoreCase("selenium Testing")) {
  
  driver.findElement(By.name("q")).clear(); Thread.sleep(3000);
  
  driver.findElement(By.name("q")).sendKeys(a[i]);
  driver.findElement(By.name("q")).sendKeys(Keys.ENTER); Thread.sleep(3000);
  break;
  
  }
  
  }
  
  }
  
  @BeforeTest public void beforeTest() {
  
  
  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
  driver.get("http:google.com"); driver.manage().window().maximize(); }
  
  @AfterTest public void afterTest() {
  
  }
  
  }
 