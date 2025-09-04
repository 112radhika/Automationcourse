package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJavaScript extends Base {
	
	public void verifyJavaScript() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //casting - control moves from page to javascript executor
		//executeScript is a method in JavascriptExecutor
		/*js.executeScript("arguments[0].click();", - syntax
		 * after comma provide the WebElement on which the click function is to be performed
		 */
		js.executeScript("arguments[0].click();", showMessageButton); //click() by JavascriptExecutor
		//y-axis value for vertical scrolling and x-axis for horizontal scrolling
		js.executeScript("window.scrollBy(0,350)", ""); //provide +ve y-axis value to scroll down
		/* scrollBy() - If scrollBy(0,350) is given then control will scroll 350px down 
		and if it is given again scrollBy(0,350),then cursor will move from 350 to next 350 so total 700px.
		
		scrollTo() - If scrollTo(0,350)is given then control will scroll 350px down.
		and if scrollTo(0,400) is given in next line then cursor will check from 0. Already cursor moved 350px as per first ScrollTo
		So the remaining 50px will be moved down. So total 400px.
		scroll()
		*/
		
		js.executeScript("window.scrollBy(0,-350)", ""); //provide -ve y-axis value to scroll up
		
	}

	public static void main(String[] args) {
		
		HandlingJavaScript javascript = new HandlingJavaScript();
		javascript.initializeBrowser();
		javascript.verifyJavaScript();
		

	}

}
