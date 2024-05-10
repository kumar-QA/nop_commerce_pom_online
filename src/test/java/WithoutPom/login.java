package WithoutPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://admin-demo.nopcommerce.com/login");
		 WebElement usernameInputFiled=driver.findElement(By.id("Email"));
	     WebElement	passwordinputFiled=driver.findElement(By.id("Password"));
		WebElement loginButton= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		usernameInputFiled.clear();
		usernameInputFiled.sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		passwordinputFiled.clear();
		passwordinputFiled.sendKeys("admin");
		Thread.sleep(2000);
		loginButton.click();
		String actualValue=driver.getTitle();
		String Expectedvalue="Dashboard / nopCommerce administration";
		Assert.assertEquals(actualValue, Expectedvalue);
	}

}
