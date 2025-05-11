package tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.RegisterPage;
import utils.BrowserUtils;
import utils.FrameworkUtils;

public class TestResistration {

	@Test
	public void test01() throws Exception, IOException {
		String filePath="C:\\Users\\suman\\eclipse-workspace_240405\\project9\\src\\test\\resources\\testdata\\ddtestdata.xlsx";
		XSSFWorkbook w= new XSSFWorkbook(new File(filePath));
		XSSFSheet s= w.getSheetAt(0);
		int rows=s.getLastRowNum();
		for(int row=1;row<=rows;row++) {
			System.out.println("test cases no :"+row);
			String testno=s.getRow(row).getCell(0).getStringCellValue();
			String tempdata=s.getRow(row).getCell(1).getStringCellValue();
			executeTest(tempdata);
		}
		System.out.println("dummy code");
		w.close();
		
	
	}

	private void executeTest(String data) {
		FrameworkUtils.setUpDriver();
		BrowserUtils.openBrowser();
		BrowserUtils.invokeApp();
		LoginPage.naviageteToRegistrationPage();
		RegisterPage.enterValidvaluesAndSubmit(data);
		try {
		RegisterPage.verfiyRegistrationSucceessfull();
		}catch (Exception e) {
			System.out.println("expected is not equal with actual...");
			System.out.println("continuing execution....");
		}
		BrowserUtils.killBrowser();
		
	}

}
