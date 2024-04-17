package gmail_new_validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import gmail.validation.pageobject.gmail_pageobject;

public class gmail_click {
	
	

	@Test
	public void clickEmail() 
	
	{

		// String driverPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", driverPath +
		//"\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		gmail_pageobject gp = PageFactory.initElements(driver, gmail_pageobject.class);
		gp.enterEmail("arunrpea16@gmail.com");// Replace with your email id
		gp.enterPassword("Arun@810532");// Replace with your password
		gp.clickEmail("Security alert");// Replace with email subject you want to click

	}

}


