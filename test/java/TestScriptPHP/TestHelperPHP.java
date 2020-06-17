package TestScriptPHP;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestHelperPHP {
 
	public WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\SeleniumChrom\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://phptravels.com/demo/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
