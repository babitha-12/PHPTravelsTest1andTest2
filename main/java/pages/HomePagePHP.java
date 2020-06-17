package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilityPHP.PageUtilityPHP;




public class HomePagePHP {
WebDriver driver;
	
	public  HomePagePHP(WebDriver driver) {
	
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	 @FindBy(xpath="//a[@href='//www.phptravels.net']")
	 WebElement phptravels;
	 @FindBy(xpath="//a[text()='Home']")
	 WebElement hometab;
	 @FindBy(xpath="//a[@href='https://www.phptravels.net/m-visa      ']")
	 WebElement visaTab;
	 @FindBy(xpath="//input[@class='select2-input']")
	 WebElement destination;
	 @FindBy(xpath="//input[@id='checkin']")
	 WebElement checkIn;
	 @FindBy(xpath="//input[@id='checkout']")
	 WebElement checkOut;	 
	 @FindBy(xpath="//div[@class='btn btn-white bootstrap-touchspin-up']")
	 WebElement adultup;
	@FindBy(xpath="//div[@class='btn btn-white bootstrap-touchspin-up']")
	   WebElement childUp;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-block']")
	    WebElement search;
		@FindBy(xpath="//button[@class='btn btn-primary']")
		WebElement details;
		@FindBy(xpath="//a[text()='Available Rooms']")
		WebElement availablerooms;
		@FindBy(xpath="//button[text()='Book Now']")
		WebElement booknow;
		public void clickonphpTravles() {
		PageUtilityPHP.waitforElementTobeClickable(driver, phptravels, 3);
		phptravels.click();
	
		}
		

	
	public void filltheFieldsontheHomePage() {
		
	
		PageUtilityPHP.isElementLoaded(driver,destination,4);
		destination.sendKeys("kochi");
		Select drop=new Select(destination);
		drop.selectByIndex(1);
		PageUtilityPHP.isElementLoaded(driver,checkIn,3);
		checkIn.clear();
		checkIn.sendKeys("09/07/20");
		PageUtilityPHP.isElementLoaded(driver,checkOut,4);
		checkOut.clear();
		checkOut.sendKeys("15/07/20");
		adultup.click();
		childUp.click();
		childUp.click();
		details.click();
		availablerooms.click();
		booknow.click();
		hometab.click();
		
		
}
	public boolean isHomePageLoaded() {
		PageUtilityPHP.isElementLoaded(driver,hometab,4);
		return(hometab.isDisplayed()&&visaTab.isDisplayed());
	}
}
