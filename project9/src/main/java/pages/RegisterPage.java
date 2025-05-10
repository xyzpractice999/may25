package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BrowserUtils.*;

public class RegisterPage {

	public static void enterValidvaluesAndSubmit(String data) {
		long random=System.currentTimeMillis();
		String temp="test"+random;
		List<WebElement> elements=driver.findElements(By.xpath("//table//*[@class=\"input\"]"));
		for(WebElement element :elements) {
			element.sendKeys(data);
		}
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	}

	public static void verfiyRegistrationSucceessfull() {
		if(driver.findElement(By.xpath("//*[text()='This username already exists.']")).isDisplayed()) {
			System.out.println("passed");
		}else {
			System.out.println("Failed");
		}
		
	}

}
