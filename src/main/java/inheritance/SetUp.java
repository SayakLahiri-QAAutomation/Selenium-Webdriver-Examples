package inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maor on 01/04/2018.
 * Inheritance Selenium with testNG example, TestAnyWebSite class extends SetUp class
 * Run the tests by right click on the testng.xml
 */

public class SetUp {
    public static WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("launching chrome browser");
        String exePath = "C:\\Appium Jars and Drivers\\Selenium\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Tested url: " + driver.getCurrentUrl());

    }

    public static void CaptureScreenshot (String ScreenshotName) throws Exception

    {
        // Capture screenshot of current screen
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        // Store screenshot on Specific location
        ImageIO.write(image, "png", new File("C:\\Users\\Maor\\Desktop\\Selenium\\" + ScreenshotName + ".png"));
    }
}