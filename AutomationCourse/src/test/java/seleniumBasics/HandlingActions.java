package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick() {
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action = new Actions(driver);
		action.contextClick(home).build().perform(); // build() - Compiles all actions into single step
		//perform() - Execute the build actions 
		//contextClick - method for right click
		
	}
	
	public void verifyMouseHover() {
		
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action = new Actions(driver);
		action.moveToElement(home).build().perform();//mouse hover
		
	}
	
	public void verifyDragAndDrop() {
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform(); // to drag and drop
				
	}
	
	public void verifyKeyboardAction() throws AWTException {
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); //control key
		r.keyPress(KeyEvent.VK_T);       //new tab
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T); //VK - Virtual Key
	}

	public static void main(String[] args) {
		HandlingActions handleaction = new HandlingActions();
		handleaction.initializeBrowser();
		//handleaction.verifyRightClick();
		//handleaction.verifyMouseHover();
		//handleaction.verifyDragAndDrop();
		try {
			handleaction.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
