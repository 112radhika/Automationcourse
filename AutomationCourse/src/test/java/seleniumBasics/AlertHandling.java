package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void simpleAlert() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		button.click();
		Alert alert = driver.switchTo().alert(); //switch to alert
		alert.accept(); //accept() - to click OK button in the alert
		
	}
	
	public void confirmationAlert() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmbutton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmbutton.click();
		Alert alertconfirm = driver.switchTo().alert();
		//alertconfirm.accept();
		alertconfirm.dismiss(); //dismiss() - to click cancel button in the alert
		
	}
	
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptbutton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promptbutton.click();
		Alert alertprompt = driver.switchTo().alert();
		System.out.println(alertprompt.getText()); // to get the text from the alert box
		alertprompt.sendKeys("Radhika"); // to enter text/value into alert text box
		alertprompt.accept();
			
	}


	public static void main(String[] args) {
		
		AlertHandling alert = new AlertHandling();
		alert.initializeBrowser();
		//alert.simpleAlert();
		//alert.confirmationAlert();
		alert.promptAlert();

	}

}
