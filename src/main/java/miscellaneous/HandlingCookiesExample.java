package miscellaneous;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maor on 4/17/2018.
 */
public class HandlingCookiesExample {

    WebDriver driver;

    @Test
    public void AddGetCookies() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://stackoverflow.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Pass name and value for cookie as parameters
        Cookie Cookiename = new Cookie("seleniumtestcookie", "123456789123");
        driver.manage().addCookie(Cookiename);

        // To get our particular Cookie by name
        System.out.println(driver.manage().getCookieNamed("seleniumtestcookie").getValue());

        // To return all the cookies of the current domain
        Set<Cookie> cookiesForCurrentURL = driver.manage().getCookies();
        for (Cookie cookie : cookiesForCurrentURL) {
            System.out.println(" Cookie Name - " + cookie.getName()
                + " Cookie Value - "  + cookie.getValue());
            }
        }

    @Test
    public void deleteCookieByName()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://stackoverflow.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // Delete our particular Cookie by name
        driver.manage().deleteCookieNamed("seleniumtestcookie");
    }

    @Test
    public void deleteAllCookies()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://stackoverflow.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
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

