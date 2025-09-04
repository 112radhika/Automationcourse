package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public WebDriver driver;
	
	public void sendKeysForFileUpload() {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		//choosefile.click();
		choosefile.sendKeys("C:\\Users\\112ra\\OneDrive\\Documents\\Radhika\\Prepare\\Defect management.docx");
		WebElement upload = driver.findElement(By.xpath("//input[@id='file-submit']"));
		upload.click();
	}
	
	public void robotClassForFileUpload() throws AWTException {
		
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement uploadpdf = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		uploadpdf.click();
		StringSelection stringselect = new StringSelection("C:\\Users\\112ra\\OneDrive\\Documents\\Radhika\\Prepare\\Additional_Git_Topics.pdf");
		//ToolKit class used to copy the file path to the system clip board
		//getDefaultToolkit() - gets the toolkit
		//getSystemClipboard() - gets the clip board from that toolkit
		//setContents(stringselect,null) - copies your data (stringselect) into the clip board.
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null); 
		Robot robot = new Robot(); // Robot class - automate keyboard and mouse operations.
		robot.delay(1000); //Adding delay
		//keyPress() - presses a key
		//keyRelease() - releases a key
		//KeyEvent is a Java class for handling keyboard actions.
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

	public static void main(String[] args) throws AWTException {
		
		FileUpload file = new FileUpload();
		file.sendKeysForFileUpload();
		//file.robotClassForFileUpload();

	}

}
