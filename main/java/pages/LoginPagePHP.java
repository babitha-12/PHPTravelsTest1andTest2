package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilityPHP.PageUtilityPHP;

public class LoginPagePHP {
WebDriver driver;
	
	public  LoginPagePHP(WebDriver driver) {
	
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//a[@class='btn yx-nfn yx-njg']")
	 WebElement loginbutton;
	 @FindBy(xpath="//a[@href='/register.php']")
	 WebElement registerbutton;
	 @FindBy(xpath="//input[@id='inputFirstName']")
	 WebElement firstname; 
	 @FindBy(xpath="//input[@id='inputLastName']")
	 WebElement lastname;
	 @FindBy(xpath="//input[@id='inputEmail']")
	 WebElement email;
	 @FindBy(xpath="//input[@id='inputPhone']")
	 WebElement phone;
	 @FindBy(xpath="//input[@id='inputAddress1']")
	 WebElement address;
	 @FindBy(xpath="//input[@id='inputCity']")
	 WebElement city;
	 @FindBy(xpath="//input[@id='stateinput']")
	 WebElement state;
	 @FindBy(xpath="//input[@id='inputPostcode']")
	 WebElement postalcode;
	 @FindBy(xpath="//input[@id='inputCountry']")
	 WebElement inputCountry;   //value=IN
	 @FindBy(xpath="//input[@id='customfield1']")
	 WebElement findus;
	 @FindBy(xpath="//input[@id='customfield2']")
	 WebElement number;
	 @FindBy(xpath="//input[@id='inputNewPassword1']")
	 WebElement password;
	 @FindBy(xpath="//input[@id='inputNewPassword2']")
	 WebElement confirmpassword;
	 @FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	 WebElement captcha;
	 @FindBy(xpath="//input[@class='btn btn-large btn-primary btn-recaptcha']")
	 WebElement register;
	
	 @FindBy(xpath="//a[@href='/logout.php]")
	 WebElement logout;
	 @FindBy(xpath="//div[@class='alert alert-success text-center']")
	 WebElement logoutmessage;
	 @FindBy(xpath="//a[@href='/index.php']")
	 WebElement homeicon;
	
	 public void registeraNewUSer() {


		 PageUtilityPHP.waitforElementTobeClickable(driver, loginbutton, 3);
		 loginbutton.click();
		 PageUtilityPHP.waitforElementTobeClickable(driver, registerbutton, 3);
		 registerbutton.click();
		 firstname.sendKeys("Helen");
		 lastname.sendKeys("jacob");
		 email.sendKeys("helen@gmail.com");
		 phone.sendKeys("96325874");
		 address.sendKeys("helen villa");
		 city.sendKeys("kochi");
		 state.sendKeys("kerala");
		 postalcode.sendKeys("96325");
		 Select drop=new Select(inputCountry);
		 drop.selectByValue("IN");
		 Select dropdown=new Select(findus);
		 drop.selectByValue("google");
		 number.sendKeys("9632456");
		 password.sendKeys("123456789");
		 confirmpassword.sendKeys("123456789");
		 captcha.click();
		 register.click();
		 logout.click();
		 String s=logoutmessage.getText();
		 if(s.equals("You have been successfully logged out."))
		 {
			 System.out.println("Succesfully logged out");
		 }
		 else
		 {
			 System.out.println("not Succesfully logged out");
	 }
		 homeicon.click();
	 }
}
