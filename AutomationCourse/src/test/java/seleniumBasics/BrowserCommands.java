package seleniumBasics;

public class BrowserCommands extends Base{
	
	public void verifyCommands() {
		
		
		String title = driver.getTitle();// to get title of the tab -> o/p - Obsqura Testing
		System.out.println(title);
		
		String url = driver.getCurrentUrl(); //to get the url ->o/p - https://selenium.qabible.in/
		System.out.println(url);
		
		//getWindowHandles - used to get handles of multiple windows
		String handleId = driver.getWindowHandle(); //getWindowHandle - to get one windowhandle -> o/p - C5845C569C0155A3BE43F418FE186A8F
		System.out.println(handleId);
		
		String source = driver.getPageSource(); //to get the page source
		System.out.println(source);
		
	}

	public static void main(String[] args) {
		
		BrowserCommands commands = new BrowserCommands();
		commands.initializeBrowser();
		commands.verifyCommands();
		

	}

}
