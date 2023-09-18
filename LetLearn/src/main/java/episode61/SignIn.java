package episode61;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import episode61a.ReadXlData;

public class SignIn {
	@Test (dataProvider = "testdata", dataProviderClass = ReadXlData.class)
	public static void HomeScreen(String email, String Pass) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElementByXPath("//p[text() = \'Consent\']").click();
		driver.findElementByXPath("//a[text() = \'Log in\']").click();
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(Pass);
		driver.findElementByXPath("//button[text() = \'LOGIN\']").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
