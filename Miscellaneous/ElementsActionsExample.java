package miscellaneous;

/**
 * Created by Maor on 01/04/2018.
 * Verify if page loaded successfully
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class ElementsActionsExample {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("launching chrome browser...");
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    //Locating element by ID and click on it
    public void ClickOnElementById() throws InterruptedException {
        driver.findElement(By.id("radio1")).click();
        Thread.sleep(2000);
    }

    @Test
    //Locating element by Name and type given texts in to input box.
    public void SendKeysToElement() throws InterruptedException {
        driver.findElement(By.name("fname")).sendKeys("My First Name");
        Thread.sleep(2000);
    }

    @Test
    //Locating element by Name and clear the input box.
    public void ClearInputBox() throws InterruptedException {
        driver.findElement(By.name("fname")).clear();
        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown() {
        if(driver!= null) {
            System.out.println("Closing chrome browser");
            driver.quit();
        }
    }
}
