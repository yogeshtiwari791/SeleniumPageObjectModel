package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.TopNavigationMenus;

public class FeaturedTest {
	
	WebDriver driver;
	
	
	@Test
	public void printFeaturedList() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestingProject\\SeleniumPageObjectModel\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://shopping.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TopNavigationMenus topNavigationMenus=new TopNavigationMenus(driver);
		topNavigationMenus.navigateToMensLifestyle().getAllFeaturedItems();
		
		driver.quit();
		
	}
	

}
