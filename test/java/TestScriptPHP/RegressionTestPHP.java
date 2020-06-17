package TestScriptPHP;


import org.testng.Assert;
import org.testng.annotations.Test;


import pages.HomePagePHP;
import pages.LoginPagePHP;


public class RegressionTestPHP extends TestHelperPHP {
  
	
  @Test
  public void verifyuserisabletofilluptheFieldsprovidedonHomepage() {
	  HomePagePHP homePagePHP=new HomePagePHP(driver);
	  homePagePHP.clickonphpTravles();
	 homePagePHP.filltheFieldsontheHomePage();
	 homePagePHP.isHomePageLoaded();
  }
  
  @Test
  public void verifyuserabletoregisteraNewUser() {
	  LoginPagePHP loginPagePHP=new LoginPagePHP(driver);
	  loginPagePHP.registeraNewUSer();
  }
}
