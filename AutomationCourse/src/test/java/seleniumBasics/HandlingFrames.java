package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void verifyFrame() {
		
		driver.navigate().to("https://demoqa.com/frames");
		List <WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size()); //size() - to get the count of frames in a page
		
		WebElement frameone = driver.findElement(By.id("frame1")); 
		driver.switchTo().frame(frameone); //driver control switches from page to frame
		
		WebElement frametext = driver.findElement(By.id("sampleHeading"));
		System.out.println(frametext.getText()); // get the text from the frame
		driver.switchTo().defaultContent(); // switches back to page from frame
		
		
	}

	public static void main(String[] args) {
		
		HandlingFrames frame = new HandlingFrames();
		frame.initializeBrowser();
		frame.verifyFrame();

	}

}
