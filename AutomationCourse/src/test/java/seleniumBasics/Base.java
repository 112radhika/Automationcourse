package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver; //declaration of variable 'driver' (a reference of type WebDriver)
	
	//browser initialization
	public void initializeBrowser() {
		
		driver = new ChromeDriver(); //actually creates the driver/browser object. ChromeDriver,FirefoxDriver,EdgeDriver - predefined driver class
		//driver = new FirefoxDriver();
		WebDriverManager.edgedriver();
	    
		//driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/"); //launching the url in browser. In get method if the default value is null means - it is expecting a string value
		driver.manage().window().maximize(); //to maximize the window
	}
	
	//to close the window
	//two methods to close the window - close and quit
	
	public void browserClose() {
		
		//driver.close(); close - closes the latest window opened
		//driver.quit(); //quit - closes all the windows opened
		
	}
	

	public static void main(String[] args) {
		
		Base base = new Base();
		base.initializeBrowser();
		base.browserClose();

	}

}
