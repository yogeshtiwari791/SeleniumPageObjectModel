package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageobjects.RediffHomePage;

public class TopNavigationMenus {
	
	WebDriver driver;
	public TopNavigationMenus(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="topcat1")
	WebElement mensLifestyle;
	
	@FindBy(id="topcat2")
	WebElement womensLifestyle;
	
	@FindBy(id="topcat3")
	WebElement mobiles;
	
	@FindBy(id="topcat4")
	WebElement electronics;
	
	@FindBy(id="topcat5")
	WebElement watches;
	
	@FindBy(id="topcat6")
	WebElement homeAndDecor;
	
	@FindBy(id="topcat7")
	WebElement personalCare;
	
	@FindBy(id="topcat8")
	WebElement healthAndFitness;
	
	@FindBy(xpath="//span[@class='shoponlinehd']")
	WebElement heading;
	
	public TopNavigationMenus navigateToMensLifestyle() {
		mensLifestyle.click();
		return this;
	}
	
	public TopNavigationMenus navigateToWomenLifestyle() {
		womensLifestyle.click();
		return this;
	}
	
	public TopNavigationMenus navigateToElectronics() {
		electronics.click();
		return this;
	}
	
	public TopNavigationMenus navigateToMobile() {
		mobiles.click();
		return this;
	}
	
	public TopNavigationMenus navigateToWatches() {
		watches.click();
		return this;
	}
	
	public TopNavigationMenus navigateToHomeAndDecor() {
		homeAndDecor.click();
		return this;
	}
	
	public TopNavigationMenus navigateToPersonalCare() {
		personalCare.click();
		return this;
	}
	
	public TopNavigationMenus navigateToHealthAndFitness() {
		healthAndFitness.click();
		return this;
	}
	
	public String getHeading() {
		
		return heading.getText();
		
		
	}
	
	public TopNavigationMenus getPageTitle() {
		
		System.out.println(driver.getTitle());
		return this;
		
	}
	
	public TopNavigationMenus validatePageWithHeading(String expected) {
		
		
		Assert.assertEquals(getHeading(), expected);
		return this;
		
	}
}
