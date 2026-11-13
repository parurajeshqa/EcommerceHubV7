package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage
{
	
	// Constructors
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//Locators
	
	// Link - MyAccount
	@FindBy(xpath="//i[@class='fa-solid fa-user']")
	WebElement link_MyAccount;
	
	//Link - Login
	@FindBy(xpath ="//a[normalize-space()='Login']")
	WebElement link_Login;
	
	// Action Methods
	
	public void clickMyAccount()
	{
		link_MyAccount.click();
	}
	
	public void goToLogin()
	{
		link_Login.click();
	}
	
}
