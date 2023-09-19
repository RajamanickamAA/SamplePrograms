package episode40;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		driver.findElementByXPath("//p[text() = \'Consent\']").click();
		WebElement table = driver.findElementById("simpletable");
		List<WebElement> tableheaderrow = table.findElements(By.tagName("th"));
		for (WebElement webElement : tableheaderrow) {
			System.out.println(webElement.getText()	);
			}
		List<WebElement> tablebodyrow = table.findElements(By.cssSelector("tbody tr"));
		int rowcount = tablebodyrow.size();
		System.out.println(rowcount);
		for (int i = 0; i < rowcount; i++) {
			
			List<WebElement> rows =  tablebodyrow.get(i).findElements(By.tagName("td"));
			WebElement datas = rows.get(1);
			String values = datas.getText();
			System.out.println(values);
			if(values.equals("Raj")) {
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				Thread.sleep(3000);
				break;
			}
		}
		
		driver.quit();




	}

}
