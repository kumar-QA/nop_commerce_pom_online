package Pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	WebElement usernameinputFiled;
	
	@FindBy(name="Password")
	WebElement passwordinputFiled;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;
	
	public void perfomLogin() {
		usernameinputFiled.clear();
		usernameinputFiled.sendKeys("admin@yourstore.com");
		passwordinputFiled.clear();
		passwordinputFiled.sendKeys("admin");
		loginbutton.click();
		
	}
	
}
