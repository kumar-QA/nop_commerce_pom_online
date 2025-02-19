package Pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
	WebElement catalogLink;
	
	@FindBy(xpath="//a[@href='/Admin/Product/List']")
	WebElement productlink;
	
	public void checkProductLinkFunction() {
		catalogLink.click();
		productlink.click();
		
	}
	
}
