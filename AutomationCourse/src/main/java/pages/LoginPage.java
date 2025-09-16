package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*page class - find web elements and performs action on it
How Page Factory Works
	Create a Page Class.
	Declare web elements using @FindBy.
	Initialize elements with PageFactory.initElements().
	Write methods to interact with elements.
*/

public class LoginPage {
	
	public WebDriver driver;
	
	//constructor creation is mandatory for pagefacory
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //initElements - helps to initialize elements
		
	}
	// locate and declare web elements
	@FindBy(id="user-name") private WebElement username; 
	@FindBy(id="password") private WebElement password;
	@FindBy(id="login-button") private WebElement login;
	
	//methods to perform actions with elements
	public void enterUsernameOnUsernameField(String usernameValue) {
		
		username.sendKeys(usernameValue);
	}
	
	public void enterPasswordOnPasswordField(String passwordValue) {
		
		password.sendKeys(passwordValue);
	}
	
	public void clickOnLoginButton() {
		
		login.click();
		
	}

}
