package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
	//Choosing value of a drop down
	public void verifyDropdown() {
		
		/* dropdown properties will be given in select tag <select> </select>
		 * 3 methods for finding the value of dropdown:
		 * selectByIndex - by providing the index value. Index value starts from 0
		 * selectByValue - by providing the value given for the attribute 'value'
		 * selectByVisibleText - by providing the visible text given for the dropdown options
		 */
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(drop);// creating object for the predefined class - Select
		//select.selectByIndex(2);
		//select.selectByValue("sql");
		select.selectByVisibleText("C#");
	}
	
	//Selecting check box option
	public void verifyCheckbox() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check = driver.findElement(By.xpath("//input[@value='option-1']"));
		check.click();
		System.out.println(check.isSelected());
	}
	
	//Selecting radio button option
	public void verifyRadioButton() {
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio = driver.findElement(By.xpath("//input[@value='orange']"));
		radio.click();
	}

	public static void main(String[] args) {
		HandlingDropDown dropdown = new HandlingDropDown();
		dropdown.initializeBrowser();
		//dropdown.verifyDropdown();
		dropdown.verifyCheckbox();
		//dropdown.verifyRadioButton();

	}

}
