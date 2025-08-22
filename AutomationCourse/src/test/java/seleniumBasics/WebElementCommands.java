package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void verifyWebElements() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.id("single-input-field"));//creating WebElement
		messagebox.sendKeys("Hello Radhika");
		WebElement showbutton =  driver.findElement(By.id("button-one"));
		showbutton.click();
		WebElement showmessage = driver.findElement(By.id("message-one"));
		System.out.println(showmessage.getText());
	}
	
	

	public static void main(String[] args) {
		
		WebElementCommands webelement = new WebElementCommands();
		webelement.initializeBrowser();
		webelement.verifyWebElements();

	}

}
