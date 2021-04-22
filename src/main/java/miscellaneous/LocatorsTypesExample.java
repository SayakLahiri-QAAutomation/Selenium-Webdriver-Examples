package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maor on 4/22/2018.
 * Various types of locators (HTML Attributes) examples in Selenium to build test scripts:
 * By.id (id's are the most preferred way)
 * By.name (after id's this is second preference)
 * ByClassName
 * ByLinkText
 * ByPartiaLinkText
 * ByXpath
 * By.tagName
 */

public class LocatorsTypesExample {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {

        // Setting the webdriver.chrome.driver patch or simply add it to your system variables
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com");

        // Maximum time in seconds till which webDriver will wait before throwing NoSuchElementException while locating a webElement
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("launching chrome browser...Please wait");
    }

    @Test
    // Find By.id locator, write in search store search box
    public void ByID() throws InterruptedException {
        driver.findElement(By.id("small-searchterms")).sendKeys("ByID");
        Thread.sleep(3000);

    }

    @Test
    // Find By.name locator, write in search store search box
    public void ByName() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("ByName");
        Thread.sleep(3000);
    }

    @Test
    //  Find By.className locator, clicked on Wishlist label
    public void ByClassName() throws InterruptedException {
        driver.findElement(By.className("wishlist-label")).click();
        Thread.sleep(3000);
    }

    @Test
    //  Find By.linkText locator, clicked on Computers label
    public void ByLinkText() throws InterruptedException {
        driver.findElement(By.linkText("Computers")).click();
        Thread.sleep(3000);
    }

    @Test
    //  Find By.partialLinkText locator, clicked on Computers label
    public void ByPartiaLinkText() throws InterruptedException {
        driver.findElement(By.partialLinkText("Comput")).click();
        Thread.sleep(3000);
    }

    @Test
    //  Find By.xpath locator, clicked on Books label
    public void ByXpath() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
        Thread.sleep(3000);
    }

    @Test
    //  Find By.tagName locator, Find and print all links from a web page
    public void ByTagName() throws InterruptedException {
        List <WebElement> list = driver.findElements(By.tagName("a"));
            System.out.println("links count: "+ list.size());
        for(WebElement webEl : list){
            System.out.println(webEl.getText());
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
