package utils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkUtils {

	public static void setUpDriver() {
		WebDriverManager.chromedriver().setup();
		
	}

}
