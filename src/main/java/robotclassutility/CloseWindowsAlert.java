/*
package robotclassutility;

*/
/**
 * Created by Maor on 4/13/2018.
 *//*

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

public class CloseWindowsAlert {
    // creating WebDriver instance
    WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {

        // Setting the webdriver.chrome.driver patch or simply add it to your system variables
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        driver = new ChromeDriver();
        driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll the page down by 1000 pixel vertical
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);

        // Open an alert pop up
        driver.findElement(By.xpath("/html[@class='js supports no-forcetouch cssanimations cssfilters csstransforms csstransforms3d csstransitions no-touchevents mobile-false not-iOS']/body[@class='page-template-default page page-id-23107 image-blur large-hover-icons click-effect-on-img overlay-cursor-on srcset-enabled btn-ios custom-btn-color custom-btn-hover-color shadow-element-decoration filter-style-material contact-form-material small-fancy-datas blur-page semitransparent-bullets bold-icons phantom-fade phantom-shadow-decoration phantom-custom-logo-on  top-header first-switch-logo-center first-switch-menu-left second-switch-logo-center second-switch-menu-left layzr-loading-on wpb-js-composer js-comp-ver-4.12 vc_responsive outlined-portfolio-icons album-minuatures-style-2 is-webkit no-mobile closed-overlay-mobile-header phantom-on']/div[@id='page']/div[@id='main']/div[@class='wf-wrap']/div[@class='wf-container-main']/div[@id='content']/p[4]/button")).click();
        Thread.sleep(5000);
    }

    @Test
    public void CloseAlert() throws AWTException, InterruptedException {

            // instantiating robot class
            Robot rb = new Robot();
            // keyPress and keyRelease events for closing the pop up
            rb.keyPress(KeyEvent.VK_ALT);
            rb.keyPress(KeyEvent.VK_SPACE);
            rb.keyPress(KeyEvent.VK_C);

            rb.keyRelease(KeyEvent.VK_C);
            rb.keyRelease(KeyEvent.VK_SPACE);
            rb.keyRelease(KeyEvent.VK_ALT);
            Thread.sleep(5000);
        }

    @AfterTest
    public void tearDown() throws Exception {
        // quit the browser
        driver.quit();
    }

}*/
