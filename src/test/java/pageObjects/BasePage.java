package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	// Constructors
	
	WebDriver driver;
	BasePage(WebDriver driver)
	// This is the constructor for this class
	// It takes WebDriver object as an argument, which is used to interact with the browswer.
		
		
	{
		this.driver = driver; // The passed driver is assigned to instance variable driver. This allows
		// the class and its subclasses for browser interactions.
			
		PageFactory.initElements(driver, this);
		// The above line initializes the web elements defined in the class using Selenium's PageFactory.
		// PageFactory.initElements() tells Selenium to scan the current class (this)
		// for any @FindBy annotations
		// and connect them to actual elements on the page using the provided driver.
			
	}
}
