package utilityPHP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilityPHP {

	public static WebElement isElementLoaded(WebDriver driver,WebElement elementTobeLoaded,int Time) { 
		
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement  element=wait.until(ExpectedConditions.visibilityOf(elementTobeLoaded));
		return element;
		
	}
	public static WebElement waitforElementTobeClickable(WebDriver driver,WebElement elementTobeLoaded,int Time) {
		
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement  element=wait.until(ExpectedConditions.elementToBeClickable(elementTobeLoaded));
		return element;
		
	}



}
