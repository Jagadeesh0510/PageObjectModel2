package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects1 {
	
		static WebElement Username,Password, Login;//Page factory feature combined with normal find element method
		
	public static void loginObjects(WebDriver driver) {
		 Username=driver.findElement(By.id("txtUsername"));
		 Password=driver.findElement(By.id("txtPassword"));
		 Login=driver.findElement(By.id("btnLogin"));
	}
	
		//@findby method is used here one of the page factory method
		
		@FindBy (id="menu_admin_viewAdminModule")
		static WebElement admin;
		@FindBy (id="btnAdd")
		static WebElement addUser;
		@FindBy (id="systemUser_userType")
		static WebElement userType;
		@FindBy (id="systemUser_employeeName_empName")
		static WebElement empName;
		@FindBy (id="systemUser_userName")
		static WebElement userName;
		@FindBy (id="systemUser_status")
		static WebElement status;
		@FindBy (id="systemUser_password")
		static WebElement newpassword;
		@FindBy (id="systemUser_confirmPassword")
		static WebElement confirmpassword;
		@FindBy (id="btnSave")
		static WebElement saveuser;
		
		/*
		public static void addUserObjects(WebDriver driver) {

		 * WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		 * WebElement adduser=driver.findElement(By.id("btnAdd"));// Add user
		 * 
		 * WebElement userType =driver.findElement(By.id("systemUser_userType"));//User
		 * Role
		 * 
		 * WebElement
		 * EmpName=driver.findElement(By.id("systemUser_employeeName_empName"));//
		 * Employee name WebElement
		 * username=driver.findElement(By.id("systemUser_userName")); //User name
		 * 
		 * WebElement Status = driver.findElement(By.id("systemUser_status")); //User
		 * status
		 * 
		 * WebElement newpassword=driver.findElement(By.id("systemUser_password")); //
		 * new Password WebElement
		 * confirmpassword=driver.findElement(By.id("systemUser_confirmPassword"));//
		 * confirm password
		 * 
		 * WebElement saveuser=driver.findElement(By.id("btnSave"));// Save user
		 * 
		 * }
		 */
	
}
