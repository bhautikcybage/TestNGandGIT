package Default;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void TC_1() {
		System.out.println("Hello Test 1.2.1.0");

		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		// WebDriver driver = new InternetExplorerDriver();

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///D:/findbyname.html");
		driver.findElement(By.xpath("//input[@name='BT_SEARCH']")).click();
	}
}
