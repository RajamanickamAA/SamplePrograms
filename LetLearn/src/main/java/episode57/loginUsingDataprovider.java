package episode57;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import episode57a.DataUtils;


public class loginUsingDataprovider {

	@Test(dataProvider = "login", dataProviderClass = DataUtils.class)

	public void login(String email, String Password) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElementByXPath("//p[text() = \'Consent\']").click();
		driver.findElementByXPath("//a[text() = \'Log in\']").click();
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(Password);
		driver.findElementByXPath("//button[text() = \'LOGIN\']").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
