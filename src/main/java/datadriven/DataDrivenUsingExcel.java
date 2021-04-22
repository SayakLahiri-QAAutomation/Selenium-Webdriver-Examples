package datadriven;

/**
 * Created by Maor on 07/04/2018.
 */

import java.io.*;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenUsingExcel{
    WebDriver driver;

    @BeforeTest
    public void setUp() {

        // Setting the webdriver.chrome.driver property to its executable's location
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        }

        @Test
        public void ExcelDataRead() throws IOException {

            WebElement searchbox = driver.findElement(By.name("q"));

                FileInputStream file = new FileInputStream(new File("C:\\Users\\Maor\\Desktop\\data driven\\DataDrivenUsingXLS.xlsx"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);

                HSSFSheet sheet = workbook.getSheetAt(0);

                for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                    String keyword = sheet.getRow(i).getCell(0).getStringCellValue();

                    searchbox.sendKeys(keyword);

                    searchbox.submit();

                    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

                }

                workbook.close();
                file.close();


        }
            @AfterTest
            // Closing the whole browser session
            public void tearDown() {
                if (driver != null) {
                    System.out.println("Closing chrome browser...Please wait");
                    driver.quit();

             }
        }
    }