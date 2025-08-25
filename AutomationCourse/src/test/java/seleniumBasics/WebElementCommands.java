package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void verifyWebElements() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox = driver.findElement(By.id("single-input-field"));//creating WebElement
		messagebox.sendKeys("Hello Radhika"); //sendKeys() - to input/enter a text
		WebElement showbutton =  driver.findElement(By.id("button-one"));
		showbutton.click(); // click() - to click on a button, link etc
		WebElement showmessage = driver.findElement(By.id("message-one"));
		System.out.println(showmessage.getText()); //getText() - to get the content from a textbox/text
		messagebox.clear(); // clear() - to clear the existing value
		System.out.println(showbutton.getTagName()); //getTagName - to get the name of the tag
		System.out.println(messagebox.getCssValue("border-color")); //getCssValue - to get the CSS style value
	}
	
	

	public static void main(String[] args) {
		
		WebElementCommands webelement = new WebElementCommands();
		webelement.initializeBrowser();
		webelement.verifyWebElements();

	}

}
