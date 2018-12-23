package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.RediffHomePage;
import pageobjects.RediffLoginPage;

public class TestCase1 {
	
	WebDriver driver;
	
	@Test
	public void signInTest() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\TestingProject\\SeleniumPageObjectModel\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://shopping.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		RediffHomePage rediffHomePage=new RediffHomePage(driver);
		rediffHomePage.navigateSignIn().enterEmail("yogesh@gmai.com").
										enterPassword("12345").
										clickLoginBtn().
										goToRediffShoppingHomePage();
		rediffHomePage.search("Jackets").clickSearchBtn();
		driver.quit();
		
	}

}
