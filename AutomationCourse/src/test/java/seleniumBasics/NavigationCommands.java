package seleniumBasics;

import org.openqa.selenium.By;

public class NavigationCommands extends Base {
	
	public void verifyNavigationCommands() {
		
		//to - used to navigate to different pages of same app or to different app
		driver.navigate().to("https://www.amazon.in/"); //navigate from obsqura site to amazon site
		/*driver.navigate().to("https://selenium.qabible.in/");
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		driver.findElement(By.xpath("//a[starts-with(text(),'Dynamic')]")).click();
		driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-info']")).click();*/
		driver.navigate().back(); //navigate back to Obsqura
		driver.navigate().forward(); // navigate to Amazon
		driver.navigate().refresh(); // refresh the page*/
	}

	public static void main(String[] args) {
		
		NavigationCommands navigate = new NavigationCommands();
		navigate.initializeBrowser();
		navigate.verifyNavigationCommands();

	}

}
