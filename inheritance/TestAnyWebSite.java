package inheritance;

/**
 * Created by Maor on 01/04/2018.
 * Inheritance Selenium with testNG example, TestAnyWebSite class extends SetUp class i.e TestAnyWebSite class is inheriting all
 * the variables and methods defined in SetUp class
 * Run the tests by right click on the testng.xml
 */

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnyWebSite extends SetUp {

    @Test(priority=1)
    //Locating element by ID and click on it
    public void ClickOnElementById() throws Exception {
        driver.findElement(By.id("radio1")).click();
        Thread.sleep(2000);
        // We are calling the CaptureScreenshot method defined in SetUp
        CaptureScreenshot("ClickOnElementById");
        System.out.println("Test done - ClickOnElementById");
    }

    @Test(priority=2)
    //Locating element by Name and type given texts in to input box.
    public void SendKeysToElement() throws Exception {
        driver.findElement(By.name("fname")).sendKeys("My First Name");

        // Get Actual typed string in the textbox by sendKeys and assert to Expected
        String result =  driver.findElement(By.id("text1")).getAttribute("value");
        Assert.assertEquals(result, "My First Name");

        Thread.sleep(2000);
        // We are calling the CaptureScreenshot method defined in SetUp
        CaptureScreenshot("SendKeysToElement");
        System.out.println("Test done - SendKeysToElement");
    }

    @Test(priority=3)
    //Locating element by Name and clear the input box.
    public void ClearInputBox() throws Exception {
        driver.findElement(By.name("fname")).clear();
        Thread.sleep(2000);
        // We are calling the CaptureScreenshot method defined in SetUp
        CaptureScreenshot("ClearInputBox");
        System.out.println("Test done - ClearInputBox");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            System.out.println("Closing chrome browser");
            driver.quit();
        }
    }
}
