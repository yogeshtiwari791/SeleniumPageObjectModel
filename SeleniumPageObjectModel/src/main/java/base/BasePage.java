package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	WebDriver driver;
	/*public BasePage(WebDriver driver) {
		
		this.driver=driver;
		
	}*/
	
	public WebDriver seleniumDriver() {
		
		if(Constants.browser.equalsIgnoreCase(("chrome"))){
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(Constants.browser.equalsIgnoreCase(("firefox"))){
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(Constants.browser.equalsIgnoreCase(("internet explorer"))){
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		return driver;
	}

}
