package exceptionhandling;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import static inheritance.SetUp.driver;

/**
 * Created by Maor on 5/16/2018.
 */

public class SeleniumExceptionsExample {

    @Test
    // WebDriver is switching to an invalid/not available alert
    public void NoAlertPresentException(){
        try
        {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://stackoverflow.com");
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.switchTo().alert();
        }
        catch (NoAlertPresentException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    // WebDriver is unable to identify the element during run time
    // i.e. FindBy method can’t find the element
    public void NoSuchElementException() {

        try
        {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://stackoverflow.com");
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("display")).click();
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void WebDriverException() {

        try
        {
            driver.manage().window().maximize();
        }
        catch (WebDriverException e) {
            e.printStackTrace();
        }
    }

    @Test
    // Thrown when the driver is switching to an invalid frame
    public void NoSuchFrameException() {

        try
        {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://stackoverflow.com");
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.switchTo().frame("frame_a");
        }
        catch (NoSuchFrameException e)
        {
            e.printStackTrace();
        }
    }

        @Test
        // Thrown when the driver is switching to an invalid Window
        public void NoSuchWindowException() {

            try {
                WebDriver driver = new FirefoxDriver();
                driver.get("https://stackoverflow.com");
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.switchTo().window("invalidwindowname");
            } catch (NoSuchWindowException e) {
                e.printStackTrace();
            }
        }
    }
