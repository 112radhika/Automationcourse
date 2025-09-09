package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase {
	
	@Test
	public void verifyUserLoginWithValidCredentials() {
		
			
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField();
		loginpage.enterPasswordOnPasswordField();
		loginpage.clickOnLoginButton();
	}
	
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("test_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}
	
	@Test
	public void verifyuserLoginWithInvalidUsernameAndValidPassword() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}
	
	@Test
	public void verifyUserLoginWithInvalidCredentials() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("test_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}

}
