package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBase {
	
	public WebDriver driver; //declaration of variable 'driver' (a reference of type WebDriver)
	
	//browser initialization
	@BeforeMethod
	public void initializeBrowser() {
		
		driver = new ChromeDriver(); //actually creates the driver/browser object. ChromeDriver,FirefoxDriver,EdgeDriver - predefined driver class
		//driver = new FirefoxDriver();
		WebDriverManager.edgedriver();
	    
		//driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/"); //launching the url in browser. In get method if the default value is null means - it is expecting a string value
		driver.manage().window().maximize(); //to maximize the window
	}
	
	//to close the window
	//two methods to close the window - close and quit
	
	@AfterMethod
	public void browserClose() {
		
		//driver.close(); //close - closes the latest window opened
		//driver.quit(); //quit - closes all the windows opened
		
	}

}
