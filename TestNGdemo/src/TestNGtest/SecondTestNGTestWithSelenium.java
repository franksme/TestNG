package TestNGtest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestNGTestWithSelenium
{

	WebDriver driver;
	
	@Test
	public void testOnWebsite()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		String my_title=driver.getTitle();
		System.out.println(my_title);
		
		
		System.out.println("Title is "+my_title);
		
		String expected_title="Facebook - Log In or Sign Up";
		Assert.assertEquals(my_title, expected_title);
		
		System.out.println("Test completed");
		driver.close();
	}
}
