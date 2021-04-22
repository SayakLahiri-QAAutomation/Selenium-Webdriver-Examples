package miscellaneous;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;

public class DataDrivenUsingCSV {

    // Provide CSV file path
    String CSV_PATH="C:\\Users\\Maor\\Desktop\\data driven\\DataDrivenUsingCSV.csv";
    WebDriver driver;

    @BeforeTest
    public void setUp(){

        // Setting the webdriver.chrome.driver patch or simply add it to your system variables
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");

        // Maximum time in seconds till which webDriver will wait before throwing NoSuchElementException while locating a webElement
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("launching chrome browser...Please wait");
    }

    @Test
    public void CSVDataRead() throws IOException {

        CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
        String[] csvCell;
        //while loop will be executed untill the last line In the CSV

        while ((csvCell = reader.readNext()) != null) {

            String FName = csvCell[0];
            String LName = csvCell[1];
            String Email = csvCell[2];
            String Mob = csvCell[3];
            String company = csvCell[4];

            driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(FName);
            driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(LName);
            driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys(Email);
            driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys(Mob);
            driver.findElement(By.xpath("//input[@name='Company']")).sendKeys(company);

            driver.findElement(By.xpath("//input[@value='Submit']")).click();
            driver.switchTo().alert().accept();
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
