package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase2POJ {

	static WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {
		
		//Launching browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void login() {
		
		PageFactory.initElements(driver, PageObjects1.class).loginObjects(driver);
		
		PageObjects1.Username.sendKeys("Admin");
		PageObjects1.Password.sendKeys("admin123");
		PageObjects1.Login.click();
		
	}
	@Test(dependsOnMethods = "login")
	public void addingUser() throws InterruptedException {
		
		PageFactory.initElements(driver, PageObjects1.class);
		
		PageObjects1.admin.click();
		PageObjects1.addUser.click();
		
		Select userRole = new Select(PageObjects1.userType);
		userRole.selectByVisibleText("ESS");
		
		PageObjects1.empName.sendKeys("Charlie Carter");
		PageObjects1.userName.sendKeys("Charlie Carter");
		
		Select status = new Select(PageObjects1.status);
		status.selectByVisibleText("Enabled");
		
		PageObjects1.newpassword.sendKeys("July@2021@");
		PageObjects1.confirmpassword.sendKeys("July@2021@");
		PageObjects1.saveuser.click();
		
		driver.quit();
		

		
	}
}
