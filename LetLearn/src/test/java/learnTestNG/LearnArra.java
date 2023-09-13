package learnTestNG;

import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnArra {
	@Test
	public void arra() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/waits");
		/*
		 * driver.findElementById("accept").click();
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 30); Alert until =
		 * wait.until(ExpectedConditions.alertIsPresent()); String value =
		 * until.getText(); System.out.println(value); until.accept();
		 */
		
		driver.quit();

	}
	
	

}
