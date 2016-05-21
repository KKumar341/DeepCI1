package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Test1 {

	@Test
	public void method1(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount#identifier");

		driver.findElement(By.id("Email")).sendKeys("TestUserName");
	}
	
}
