package episode56;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTestNG {
	
	@DataProvider(name = "login")
	public String[][] getdata() {
		
		String[][] data = new String[2][2];
		data[0][0] = "Koushik350@gmail.com";
		data[0][1] = "Pass123$";
		
		data[1][0] = "Koushik350@gmail.com";
		data[1][1] = "Pass123$";
		
		return data;
	}
	
	@Test(dataProvider = "login")
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
	}

}
