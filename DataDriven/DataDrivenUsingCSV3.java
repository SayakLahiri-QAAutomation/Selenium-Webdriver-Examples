package datadriven;

/**
 * Created by Maor on 07/04/2018.
 * Data Driven test example Using CSV (Don't forget to add opencsv to the POM.xml file by Maven)
 * The CSV should contain the form fields under tests i.e. in our case:
 * name     email               phone         Message
 *
 * Maor	    maorseg@gmail.com	867586586	  Please contact me
 * David	Davidd@gmail.com	8788798897
 * Igal     IgalI@gmail.com	    6557649590
 * Daniel	DanielD@gmail.com	474754547	  Hi, please contact me at my mobile
 * Frank	FrankF@gmail.com	6758658698
 * ...
 * It will than read that data from the CSV file and use it to fill the form fields.
 * After Form submitted it will verify form submitted successfully with Assert
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;

public class DataDrivenUsingCSV3 {

    // Provide CSV file path
    String CSV_PATH="C:\Users\Maor\Desktop\data driven\DataDrivenUsingCSV3.csv";
    WebDriver driver;

    @BeforeTest
    public void setUp(){

        // Setting the webdriver.chrome.driver patch or simply add it to your system variables
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mobirise.com/bootstrap-template/contact-form-template.html");

        // Maximum time in seconds till which webDriver will wait before throwing NoSuchElementException while locating a webElement
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("launching chrome browser...Please wait");
    }

    @Test
    public void CSVDataRead() throws IOException, InterruptedException {

        CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
        String[] csvCell;

        //while loop will be executed until the last line In the CSV
        while ((csvCell = reader.readNext()) != null) {

            String name = csvCell[0];
            String email = csvCell[1];
            String phone = csvCell[2];
            String Message = csvCell[3];

            // The Thread.sleep here is just for you to be able to see the execution
            driver.findElement(By.name("name")).sendKeys(name);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"email-form1-2w\"]")).sendKeys(email);
            Thread.sleep(1000);
            driver.findElement(By.name("phone")).sendKeys(phone);
            Thread.sleep(1000);
            driver.findElement(By.id("message-form1-2w")).sendKeys(Message);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/section[6]/div[3]/div/div/form/span/button")).click();
            Thread.sleep(1000);

            // Verify form submitted successfully i.e. expected string: "Thanks for filling out the form!"
            String result =  driver.findElement(By.xpath("/html/body/section[6]/div[3]/div/div/div/div")).getText();
            Assert.assertEquals(result, "Thanks for filling out the form!");
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

