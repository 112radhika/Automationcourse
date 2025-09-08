package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAuto {
	
	public WebDriver driver;
	
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
	}
	
	public void todaysDeal() {
		
		WebElement today = driver.findElement(By.linkText("Today's Deals"));
		today.click();
	}

	public static void main(String[] args) {
		
		PracticeAuto practice = new PracticeAuto();
		practice.initializeBrowser();
		practice.todaysDeal();

	}

}
