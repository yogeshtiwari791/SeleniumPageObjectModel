package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import base.TopNavigationMenus;

public class RediffHomePage{
	
	WebDriver driver;
	TopNavigationMenus topNav;
	public RediffHomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	WebElement signIn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUp;
	
	@FindBy(xpath="//input[@id='srchword']")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement searchBtn;
	
	@FindBy(xpath="//span[@class='curhand bold']")
	WebElement becomeSeller;
	
	
	
	public RediffLoginPage navigateSignIn() {
		signIn.click();
		
		return new RediffLoginPage(driver);
	}
	
	public void navigateSignUp() {
		signUp.click();
	}
	
	public RediffHomePage search(String searchKeywords) {
		searchBox.sendKeys(searchKeywords);
		
		return this;
	}
	
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public void navigateBecomeSeller() {
		becomeSeller.click();
	}
	
	
}
