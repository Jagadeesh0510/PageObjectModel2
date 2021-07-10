package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/*
 * User addition to Orange HRM site using POM framework
 * 
 */
public class TestCase1GeneralNonPOM {
		
	WebDriver driver;
	
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jagadeesh\\Downloads\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//Launching browser
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//Login
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();

	}
	
	@Test(dependsOnMethods = "login")
	public void addUser() {
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		
		WebElement userType =driver.findElement(By.id("systemUser_userType"));//User Role
		Select Usertype = new Select(userType);
		Usertype.selectByVisibleText("ESS");
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Charlie Carter");// Employee name
		driver.findElement(By.id("systemUser_userName")).sendKeys("Charlie Carter");			//User name
		
		WebElement Status = driver.findElement(By.id("systemUser_status"));		//User status
		Select status = new Select(Status);
		status.selectByVisibleText("Enabled");
		
		driver.findElement(By.id("systemUser_password")).sendKeys("July@2021@"); // new Password
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("July@2021@");// confirm password
		
		driver.findElement(By.id("btnSave")).click();// Save user
		
		driver.quit();

	}
	
}
