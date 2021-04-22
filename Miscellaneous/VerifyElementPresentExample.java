package miscellaneous;

/**
 * Created by Maor on 01/04/2018.
 * Verify if page loaded successfully
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class VerifyElementPresentExample {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("launching chrome browser...");
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
    }

    @Test
    public void VerifyElementPresent () throws InterruptedException
    {
        for (int i=1; i<6; i++)
        {

            //To verify element is present on page or not.
            String XPath = "//input[@id='text"+i+"']";
            Boolean iselementpresent = driver.findElements(By.xpath(XPath)).size()!= 0;
            if (iselementpresent == true)
            {
                System.out.print("\nTargeted TextBox"+i+" Is Present On The Page");
            }
            else
            {
                System.out.print("\nTargeted Text Box"+i+" Is Not Present On The Page");
            }
        }
    }

    @AfterTest
    public void tearDown() {
        if(driver!= null) {
            System.out.println("...Closing chrome browser");
            driver.quit();
        }
    }
}
