package episode54;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG {
	
	@Parameters ({"emailID", "password"})
	@Test
	public void LaunchBrowser(String email , String Password) {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElementByXPath("//p[text() = \'Consent\']").click();
		driver.findElementByXPath("//a[text() = \'Log in\']").click();
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(Password);
		driver.findElementByXPath("//button[text() = \'LOGIN\']").click();
		String title = driver.getTitle();
		System.out.println(title);
				

	}

}
