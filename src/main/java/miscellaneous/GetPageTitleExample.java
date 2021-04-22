package miscellaneous;

/**
 * Created by Maor on 01/04/2018.
 * Verify if page loaded successfully
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GetPageTitleExample {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("launching chrome browser...");
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGooglePageTitleInChromeBrowser() throws InterruptedException {
        driver.navigate().to("http://www.google.com");
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - " + strPageTitle);
        Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
    }

    @AfterTest
    public void tearDown() {
        if(driver!= null) {
            System.out.println("Closing chrome browser");
            driver.quit();
        }
    }
}
