package pages;

import org.openqa.selenium.By;
import static utils.BrowserUtils.*;
public class LoginPage {

	public static void naviageteToRegistrationPage() {
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
	}

}
