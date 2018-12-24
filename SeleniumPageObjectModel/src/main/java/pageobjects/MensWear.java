package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.TopNavigationMenus;

public class MensWear {

	WebDriver driver;
	TopNavigationMenus topNav;
	
	public MensWear(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='sboxnew']")
	
	List<WebElement> featuredList;
	
	public void getAllFeaturedItems() {
		
		for (WebElement webElement : featuredList) {
			
			System.out.println((webElement.getText()));
		}
		
	}
	
	
	
}
