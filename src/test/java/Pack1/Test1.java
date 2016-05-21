package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test1 {
	
	WebDriver driver;
	
    @BeforeTest
    public void beforeTest() {  
    	System.out.println("<<SYSO>> In Before test");
        driver = new FirefoxDriver();  
    }       
    @AfterTest
    public void afterTest() {
    	System.out.println("<<SYSO>> In After test");
        driver.quit();          
    }       

	@Test
	public void method1(){
		driver.get("https://accounts.google.com/ServiceLogin?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount#identifier");

		driver.findElement(By.id("Email")).sendKeys("TestUserName");
	}
	
}
