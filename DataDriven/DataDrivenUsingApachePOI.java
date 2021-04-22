package datadriven;

/**
 * Created by Maor on 5/14/2018.
 * Test login form with many different sets of test data using Data Driven testing
 * Using Apache POI - open source library to design
 * or modify Microsoft Office files
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenUsingApachePOI {
    WebDriver driver;

    // XSSFWorkbook: It is a class represents XLSX file
    XSSFWorkbook workbook;
    // XSSFSheet: It is a class represents a sheet in a XLSX file
    XSSFSheet sheet;
    // XSSFCell: It is a class represents a cell in a row of XLSX file
    XSSFCell cell;

    @BeforeTest
    public void setUp(){

        // Setting the webdriver.chrome.driver patch or simply add it to your system variables
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.get("http://demo.nopcommerce.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("launching chrome browser...Please wait");
    }

    @Test
    public void WrongEmail() throws IOException {
        // Import excel sheet
        File src = new File("C:\\Users\\Maor\\Desktop\\data driven\\POI\\Wrong Email.xlsx");
        // Load the file
        FileInputStream fis = new FileInputStream(src);
        // Load he workbook
        workbook = new XSSFWorkbook(fis);
        // Load the sheet with test data
        sheet = workbook.getSheetAt(0);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            // Retrieve data for Email
            cell = sheet.getRow(i).getCell(0);

            driver.findElement(By.id("Email")).clear();
            driver.findElement(By.id("Email")).sendKeys(cell.getStringCellValue());

            // Retrieve data for password
            cell = sheet.getRow(i).getCell(1);
            driver.findElement(By.id("Password")).clear();
            driver.findElement(By.id("Password")).sendKeys(cell.getStringCellValue());

            // To click on Login button
            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).submit();

            //To write data in the excel
            FileOutputStream fos=new FileOutputStream(src);
            // Result to be written in the excel sheet
            String message = "Test Pass";
            // Create cell where data needs to be written.
            sheet.getRow(i).createCell(2).setCellValue(message);
            // Write content
            workbook.write(fos);

            // Verify Wrong email notification in case we tried to enter invalid emails
            String result = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[1]/span/span")).getText();
            Assert.assertEquals(result, "Wrong email");

        }
    }

    @Test
    public void NoCustomerAccountFound() throws IOException {
        // Import excel sheet
        File src = new File("C:\\Users\\Maor\\Desktop\\data driven\\POI\\No customer account found.xlsx");
        // Load the file.
        FileInputStream fis = new FileInputStream(src);
        // Load he workbook
        workbook = new XSSFWorkbook(fis);
        // Load the sheet with test data
        sheet = workbook.getSheetAt(0);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            // Retrieve data for Email
            cell = sheet.getRow(i).getCell(0);
            driver.findElement(By.id("Email")).clear();
            driver.findElement(By.id("Email")).sendKeys(cell.getStringCellValue());

            // Retrieve data for password
            cell = sheet.getRow(i).getCell(1);

            driver.findElement(By.id("Password")).clear();
            driver.findElement(By.id("Password")).sendKeys(cell.getStringCellValue());
            driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);

            //To write data in the excel
            FileOutputStream fos=new FileOutputStream(src);
            // Result to be written in the excel sheet
            String message = "Test Pass";
            // Create cell where data needs to be written.
            sheet.getRow(i).createCell(2).setCellValue(message);
            // Write content
            workbook.write(fos);

            // Verify No customer account notification in case we tried to enter invalid account
            String result = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
            Assert.assertEquals(result, "Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found");
        }
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

