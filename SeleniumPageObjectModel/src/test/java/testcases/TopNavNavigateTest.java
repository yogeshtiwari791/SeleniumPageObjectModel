package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.TopNavigationMenus;
import pageobjects.RediffHomePage;

public class TopNavNavigateTest {
	
	WebDriver driver;
	Properties prop=new Properties();
	FileInputStream fis;
	
	@Test
	public void topNavNavigationTest() {
		
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/navigationHeadings.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://shopping.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*TopNavigationMenus topNavigationMenus=new TopNavigationMenus(driver);
		topNavigationMenus.navigateToMensLifestyle().validatePageWithHeading(prop.getProperty("mensLifestyle")).
							navigateToWomenLifestyle().validatePageWithHeading(prop.getProperty("womensLifestyle")).
							navigateToMobile().validatePageWithHeading(prop.getProperty("mobiles")).
							navigateToElectronics().validatePageWithHeading(prop.getProperty("electronics")).
							navigateToWatches().validatePageWithHeading(prop.getProperty("watches")).
							navigateToHomeAndDecor().validatePageWithHeading(prop.getProperty("homeAndDecor")).
							navigateToPersonalCare().validatePageWithHeading(prop.getProperty("personalCare")).
							navigateToHealthAndFitness().validatePageWithHeading(prop.getProperty("healthAndFitness"));		
		
		driver.quit();*/
		
	}	

}
