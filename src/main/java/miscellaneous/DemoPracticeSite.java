package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maor on 4/17/2018.
 * Practice Site with 11 basic selenium elements tests to complete
 */

public class DemoPracticeSite {
    WebDriver driver;

    @BeforeTest
    public void setUp() {

        // Setting the webdriver.chrome.driver patch or simply add it to your system variables
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium-vinod.blogspot.co.il/p/task1.html");

        // Maximum time in seconds till which webDriver will wait before throwing NoSuchElementException while locating a webElement
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        System.out.println("launching browser...Please wait");
    }

    @Test // Exercise 01
    public void EnterFirstName() throws InterruptedException {
        driver.findElement(By.id("sel_1")).sendKeys("Maor");
        // Get Actual typed string in the text box by sendKeys and assert to Expected
        String result =  driver.findElement(By.id("sel_1")).getAttribute("value");
        Assert.assertEquals(result, "Maor");
        System.out.println("Typed: " + result);
        Thread.sleep(3000);
    }

    @Test
    public void CheckLastName() throws InterruptedException {

        Thread.sleep(5);
    }

    @Test // Exercise 03
    public void GetNameAttribute() throws InterruptedException {
        // Get the Name Attribute Value From This Web Element
        String result =  driver.findElement(By.name("middle_Name")).getAttribute("name");
        System.out.println("getAttribute: " + result);
        Thread.sleep(3000);
    }

    @Test // Exercise 04
    public void ReadValue() throws InterruptedException {

        // Read the Value From 1'st Web Element and Enter it in 2n'd Web element
        String result =  driver.findElement(By.id("sel_2")).getAttribute("value");
        driver.findElement(By.id("sel_3")).sendKeys(result);

        // Get string in the 2n'd text box and assert to Expected
        String result1 =  driver.findElement(By.id("sel_3")).getAttribute("value");
        Assert.assertEquals(result, "100");
        System.out.println("Typed: " + result1);
        Thread.sleep(3000);
    }

    @Test // Exercise 05
    public void SelectGender() throws InterruptedException {

        // Scroll down and up example using JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the page down by 1000 pixel vertical
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/form[1]/input[6]")).click();
        Thread.sleep(3000);

    }

    @Test  // Exercise 06
    public void selectRadioButton() throws InterruptedException {
        // Count radio buttons in a page using xpath
        java.util.List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Radio buttons count: " + radio.size());

        // Select radio button which contain attribute "name"
        //String radio1 =  driver.findElement(By.xpath("//input[@type='radio']")).getAttribute("name");
        driver.findElement(By.name("vinod_2")).click();
        Thread.sleep(3000);

    }

    @Test  // Exercise 07, Select 4 Star from below checkbox
    public void selectFromCheckbox() throws InterruptedException {

        // Scroll down and up example using JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the page down by 1000 pixel vertical
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("checkbox-3")).click();
        Thread.sleep(3000);
    }

    @Test  // Exercise 08
    public void SelectFromDropDownBox() throws InterruptedException {
        WebElement testDropDown = driver.findElement(By.name("language"));
        Select dropdown = new Select(testDropDown);

        // selectByValue
        dropdown.selectByValue("german");
        Thread.sleep(3000);
    }

    @Test  // Exercise 09 - Click the button to get the text that is displayed on the button
    public void GetTextFromButton() throws InterruptedException {

        // Scroll down and up example using JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the page down by 1000 pixel vertical
        js.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.id("myBtn")).click();
        String result =  driver.findElement(By.id ("myBtn")).getAttribute("value");
        Assert.assertEquals(result, "Try it");
        System.out.println("Button string is: " + result);
        Thread.sleep(3000);
    }

    @Test  // Exercise 10 - Click on a Link and than navigate back to return to original page
    public void ClickOnLinkAndGetTitle () throws InterruptedException {
        // Scroll down and up example using JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the page down by 1000 pixel vertical
        js.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.linkText("Selenium webdriver tutorial")).click();
        driver.navigate().back();

    }

    @Test  // Exercise 11
    // Click on Link. This will open a page in new window.
    public void ClickOnChooseFile() throws InterruptedException {
        driver.findElement(By.partialLinkText("Learn TestNG")).click();
        Thread.sleep(3000);
        // Print the title of new window and close it
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - " + strPageTitle);
        Assert.assertTrue(strPageTitle.equalsIgnoreCase("Selenium WebDriver: TestNG Introduction"), "Page title doesn't match");


        // and then print the title of parent window.

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
