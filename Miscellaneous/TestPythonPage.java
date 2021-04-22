package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

/**
 * Created by Maor on 4/17/2018.
 */

public class TestPythonPage {

    WebDriver driver ;

    @BeforeTest
    public void setUp() {
        System.out.println("Launching chrome browser...");
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.python.org");
        driver.manage().window().maximize();
        // The implicit wait will tell to the web driver to wait for 15 sec
        //  before it throws a "No Such Element Exception"
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    // Below some Unit tests using TestNG

    @Test
    public void VerifyWebPageLoad() throws InterruptedException {
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: " + strPageTitle);
        Assert.assertTrue(strPageTitle.equals("Welcome to Python.org"), "Page title doesn't match");
    }

    @Test
    public void VerifySearchReturnNoResultsFound() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("Crossbow");
        driver.findElement(By.name("submit")).submit();
        System.out.println("" + driver.findElement(By.cssSelector("ul.list-recent-events.menu > p")).getText());
        assertEquals("No results found.",driver.findElement(By.cssSelector("ul.list-recent-events.menu > p")).getText());
    }

    @Test
    public void VerifySearchReturnResultsFound() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("python");
        driver.findElement(By.name("submit")).submit();
        System.out.println("Print Search result contains: " + driver.findElement(By.cssSelector("ul.list-recent-events.menu > li:nth-of-type(1) > h3 > a")).getText());
        assertEquals("Python Events Calendar",driver.findElement(By.cssSelector("ul.list-recent-events.menu > li:nth-of-type(1) > h3 > a")).getText());
    }

    @Test
    public void BeginnerGuide() throws InterruptedException {
        driver.findElement(By.linkText("Start with our Beginner’s Guide")).click();
        driver.findElement(By.linkText("BeginnersGuide/Tutorials")).click();
        driver.findElement(By.cssSelector("#searchinput")).sendKeys("Python");
        driver.findElement(By.name("titlesearch")).click();
        System.out.println("Print Search result contains: " + driver.findElement(By.cssSelector("ol > li:first-child > a > strong")).getText());
        assertEquals("(2013-2014 Python 2.x-3.x survey.pdf)",driver.findElement(By.cssSelector("ol > li:first-child > a > strong")).getText());
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
