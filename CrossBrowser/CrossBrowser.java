package crossbrowser;

/**
 * Created by Maor on 31/03/2018.
 * Passing browser parameter from testng xml file than run any @Test parallel on Multiple Browsers
 * Run the tests by right click on the testng.xml
 */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception{
        // Check if parameter passed fromאtestng.xml is 'firefox'
        if (browser.equalsIgnoreCase("firefox")){
        // Create firefox instance
        // Download from https://www.seleniumhq.org/download/
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\geckodriver.exe";
        System.setProperty("webdriver.firefox.driver", exePath);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com");
        }
        // Check if parameter passed from testng.xml is 'chrome'
        else if
        (browser.equalsIgnoreCase("chrome")){
         // Setting the webdriver.chrome.driver patch or simply add it to your system variables
         // Download from https://www.seleniumhq.org/download/
         String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", exePath);
         // Create chrome instance
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http://demo.nopcommerce.com");
         driver.manage().window().maximize();
        }

        else if
            (browser.equalsIgnoreCase("ie")){
            // Setting the webdriver.chrome.driver patch or simply add it to your system variables
            // Download from https://www.seleniumhq.org/download/
            String exePath = "C:\\Appium Jars and Drivers\\Selenium\\C:\\Appium Jars and Drivers\\Selenium\\MicrosoftWebDriver.exe";
            System.setProperty("webdriver.edge.driver", exePath);

            // Create Edge instance
            WebDriver driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://demo.nopcommerce.com");
            driver.manage().window().maximize();
        }

        else{
        // If no browser passed throw exception
        throw new Exception("Browser is not correct");

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Write To Input Box example: in 'SEARCH' and hit Enter to get results
    @Test
    public void WriteToInputBox() throws InterruptedException {

        driver.findElement(By.name("q")).sendKeys("iPhone X");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        // Get and print the results
        WebElement resultsTextBox = driver.findElement(By.className("no-result"));
        String result = resultsTextBox.getText();
        System.out.println("" + result);

        // Verify that for no matches found - you give informative message
        Assert.assertEquals(result, "No products were found that matched your criteria.");
        Thread.sleep(3000);
    }

    @AfterTest
    // Closing the whole browser session
    public void tearDown()
    {
        if (driver != null)
        {
            System.out.println("Closing browser...Please wait");
            driver.quit();
        }
    }
}
