package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class RediffLoginPage{
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='logid']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name='pswd']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//u[contains(text(),'Go to rediff shopping home page.')]")
	WebElement goToRediffHomePage;
	
	public RediffLoginPage enterEmail(String email) {
		
		emailId.sendKeys(email);
		return this;
	}
	
	public RediffLoginPage enterPassword(String pwd) {
		
		password.sendKeys(pwd);
		return this;
	}
	
	public RediffLoginPage clickLoginBtn() {
		
		loginBtn.click();
		return this;
		
	}
	
	public RediffHomePage goToRediffShoppingHomePage() {
		goToRediffHomePage.click();
		
		return new RediffHomePage(driver);
	}
	
	public void same() {
		
	}

}
