package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maor on 4/17/2018.
 */

public class TestNGExample {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        // code doing something here...
        System.out.println("Set up code run...");
        Reporter.log("Set up resource - step pass");

    }

    /* priority attribute within @Test annotation. By seeting the value of this
    priority attribute we can order the test methods as our need.*/
    @Test (priority = 1)
    public void TestMethod1() throws InterruptedException {
        // code doing something here...
        System.out.println("TestMethod1 run successfully");

    }

    @Test (priority = 2)
    public void TestMethod2() throws InterruptedException {
        // code doing something here...
        System.out.println("TestMethod2 run successfully");

    }

    @Test (priority = 3)
    public void TestMethod3() throws InterruptedException {
        // code doing something here...
        System.out.println("TestMethod3 run successfully");

    }

    /* timeOut attribute within the @Test annotation method is assigned a value specifying
    the number of milliseconds. In case the test method exceeds the timeout value,
    the test method is marked as failure with ThreadTimeoutException.*/

    @Test (timeOut = 1000)
    public void timeOutTest() throws InterruptedException {
        // code doing something here...
        Thread.sleep(3000);
        System.out.println("Test will fail with ThreadTimeoutException because it took 3 seconds");

    }

    @Test
    // Selenium WebDriver with TestNG framework
    // using Assert to verify expected vs. actual result for simple login scenario
    public void SimpleLogin() {

        // Create firfox driver's instance
        WebDriver driver = new FirefoxDriver();

        //  implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        // Launch online-calculator
        driver.get("http://demo.nopcommerce.com/login");

        // Login scenario
        driver.findElement(By.id("Email")).sendKeys("fakegmail@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("fakepassword");
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);

        // Get result
        WebElement CalcResult = driver.findElement(By.xpath("/html[@class='html-login-page']/body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page login-page']/div[@class='page-body']/div[@class='customer-blocks']/div[@class='returning-wrapper fieldset']/form/div[@class='message-error validation-summary-errors']"));
        String result = CalcResult.getText();


        //////////////////////////////////////////////////////////////////////////////////////////////////////

        // Some examples of TestNG Assertions i.e. validations in our tests to report them as pass or fail

        //1. Assert.assertEquals
        Assert.assertEquals(result, "Login was unsuccessful. Please correct the errors and try again.\n" +
        "No customer account found","Login unsuccessful notification, Actual doesn't match to Expected.");

        /*2. assertTrue
        Assert.assertTrue(result.contains("Login was unsuccessful"),"Condition return false instead of true.");*/

        /*3. assertFalse
        Assert.assertFalse(result.contains("Error in login"),"Condition return true instead of false.");*/

        /*4. assertNotNull
        Assert.assertNotNull(result);*/
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////

    @AfterTest
    public void tearDown() {
        if(driver!= null) {
            System.out.println("Close resource code run...");
            Reporter.log("Close resource - step pass");
            driver.quit();
        }
    }
}

