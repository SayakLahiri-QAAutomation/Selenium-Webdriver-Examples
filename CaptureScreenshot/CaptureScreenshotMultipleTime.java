package capturescreenshot;

/**
 * Created by Maor on 31/03/2018.
 */

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshotMultipleTime {

    @Test
    public void TestJavaScenario1(){

        // Setting the webdriver.chrome.driver property to its executable's location
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Call captureScreenShot method
        CaptureScreenshotMultipleTime.captureScreenShot(driver);

        // Maximize the window
        driver.manage().window().maximize();

        // Call captureScreenShot method
        CaptureScreenshotMultipleTime.captureScreenShot(driver);

        // Pass the url
        driver.get("http://www.google.com");

        // Call captureScreenShot method
        CaptureScreenshotMultipleTime.captureScreenShot(driver);

        // TearDown - Closing session
        driver.quit();

    }
    // Capture Screen Shot method
    public static void captureScreenShot(WebDriver ldriver){

        // Take screenshot and store as a file format
        File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);

        try {
        // Copy the  screenshot to desired location using copyFile method

            FileUtils.copyFile(src, new File("C:\\Users\\Maor\\Desktop\\Selenium\\" + System.currentTimeMillis()+".png"));                              } catch (IOException e)

        {
            System.out.println(e.getMessage());
        }
    }

}
