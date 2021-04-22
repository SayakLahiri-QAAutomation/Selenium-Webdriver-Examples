package datadriven;

/**
 * Created by Maor on 07/04/2018.
 * Data Driven Test example Using CSV
 * It will read data from CSV file and use
 * It to fill form fields
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;

public class DataDrivenUsingCSV2 {

    // Provide CSV file path
    String CSV_PATH="C:\Users\Maor\Desktop\data driven\DataDrivenUsingCSV2.csv";
    WebDriver driver;

    @BeforeTest
    public void setUp(){

        // Setting the webdriver.chrome.driver patch or simply add it to your system variables
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com/");

        // Maximum time in seconds till which webDriver will wait before throwing NoSuchElementException while locating a webElement
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("launching chrome browser...Please wait");
    }

    @Test
    public void CSVDataRead() throws IOException, InterruptedException {

        CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
        String[] csvCell;

        driver.findElement(By.className("ico-login")).click();

        //while loop will be executed until the last line In the CSV
        while ((csvCell = reader.readNext()) != null) {

            String Email = csvCell[0];
            String Password = csvCell[1];

            driver.findElement(By.id("Email")).sendKeys(Email);
            Thread.sleep(1000);
            driver.findElement(By.id("Password")).sendKeys(Password);
            Thread.sleep(1000);
            driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
            driver.findElement(By.id("Email")).clear();
            driver.findElement(By.id("Password")).clear();
            Thread.sleep(1000);

            //Get and print the results
            WebElement resultsTextBox = driver.findElement(By.xpath("/html[@class='html-login-page']/body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page login-page']/div[@class='page-body']/div[@class='customer-blocks']/div[@class='returning-wrapper fieldset']/form/div[@class='message-error validation-summary-errors']"));
            String result = resultsTextBox.getText();
            System.out.println("" + result);

            // Verify that for no matches found - you give informative message and take a screenshot
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
