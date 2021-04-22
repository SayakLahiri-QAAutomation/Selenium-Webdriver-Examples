package continuousintegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/**
 * Created by Maor on 4/17/2018.
 * Below tests run using testng.xml with Continuous Integration tool Jenkins with maven (you need to configure both to work on your pc
 * refer to the Jenkins quick installation guide txt guide in this package
 */
public class FirstSeleniumTestScript {

     WebDriver driver;

     // assertEquals () Pass example

    @Test
    public void AsserPassExample() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://stackoverflow.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("display-name")).clear();
        driver.findElement(By.id("display-name")).sendKeys("J.Doe");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("you@example.com");
        driver.findElement(By.id("submit-button")).click();
        assertEquals("Password cannot be empty.",driver.findElement(By.className("message-text")).getText());
        Thread.sleep(5);
    }

    // assertEquals () Fail example
    @Test
    public void AsserFailExample() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://stackoverflow.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("display-name")).clear();
        driver.findElement(By.id("display-name")).sendKeys("J.Doe");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("you@example.com");
        driver.findElement(By.id("submit-button")).click();
        assertEquals("Password cannot be...",driver.findElement(By.className("message-text")).getText());
        Thread.sleep(5);
    }

    // assertThat() Pass example

    @Test
    public void AsserExample() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://stackoverflow.com");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("display-name")).clear();
        driver.findElement(By.id("display-name")).sendKeys("J.Doe");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("you@example.com");
        driver.findElement(By.id("submit-button")).click();
        Thread.sleep(5);
    }

    // () Pass example

    @Test
    public void NewTestHere() throws InterruptedException {

    }

    @AfterTest
    // Closing the whole browser session
    public void tearDown() {
        if (driver != null) {
            System.out.println("Closing browser...Please wait");
            driver.quit();
        }
    }
}
