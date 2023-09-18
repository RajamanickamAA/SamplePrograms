package episode55;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	RemoteWebDriver driver;
	@Parameters ({"emailID", "password", "Browser"})
	@Test
	public void LaunchBrowser(String email , String Password, String Browser) {
		
		
		switch (Browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;

		case "Firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Browser not defined");
			break;
		}

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
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
