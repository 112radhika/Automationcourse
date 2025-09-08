package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	//@Test convert a method to test method. Execute it by clicking on Run
	@Test
	public void sampleTestcase() {
		
		System.out.println("Sample Testcase");
	}
	//Task to be executed before @Test annotation
	@BeforeMethod
	public void beforMethod() {
		
		System.out.println("Ready to write a test case");
	}
	//Task to be executed after @Test annotation
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After method");
	}
	
	@BeforeClass
	public void beforClass() {
		
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After class");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("After suite");
	}

}
