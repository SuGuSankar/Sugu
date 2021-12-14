package org.fblogin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDriven {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement searchButton = driver.findElement(By.id("twotabsearchtextbox"));
		searchButton.sendKeys("iphone");

		WebElement searchClick = driver.findElement(By.id("nav-search-submit-button"));
		searchClick.click();

		List<WebElement> iphoneModels = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		
		File file = new File("D:\\FacebookLogin\\FileManager\\FileDriven.xlsx");

		Workbook wb = new XSSFWorkbook();

		Sheet createSheet = wb.createSheet("Iphone Datas");
		
		for (int i = 0; i < iphoneModels.size(); i++) {

			WebElement iphoneText = iphoneModels.get(i);

			String iphone = iphoneText.getText();	
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(iphone);
		
			
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		wb.write(fileOutputStream);

		Thread.sleep(5000);
		driver.close();
	}

}
