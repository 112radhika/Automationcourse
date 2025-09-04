package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{
	
	public void verifyTable() {
		
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(table.getText()); // fetch the data of entire table
		//WebElement row = driver.findElement(By.xpath("//td[text()='54450.45']//parent::tr"));
		WebElement row = driver.findElement(By.xpath("//a[text()='NIFTY 50']//ancestor::tr"));
		System.out.println(row.getText()); //fetching the value of single row
		
		/*Another way to fetch the value of single row
		 * WebElement row=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
		System.out.println(row.getText());//fetching the value of single row
		 */
		
	}

	public static void main(String[] args) {
		
		HandlingTable handletable = new HandlingTable();
		handletable.initializeBrowser();
		handletable.verifyTable();

	}

}
