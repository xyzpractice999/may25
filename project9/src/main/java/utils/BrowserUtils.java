package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtils {
	public static WebDriver driver;

	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void invokeApp() {
		driver.get("https://parabank.parasoft.com/");

	}

	public static void killBrowser() {
		driver.quit();

	}

}
