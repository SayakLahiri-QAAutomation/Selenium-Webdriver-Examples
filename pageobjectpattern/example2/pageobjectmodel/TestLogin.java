package pageobjectpattern.example2.pageobjectmodel;

/**
 * Created by Maor on 6/9/2018.
 */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {

    WebDriver driver;
    Login objLogin;
    Home objHomePage;

    @BeforeTest
    public void setup() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/login");
    }

    /**
     * This test case will login in http://demo.guru99.com/V4/
     * Verify login page title as guru99 bank
     * Login to application
     * Verify the home page using Dashboard message
     */

    @Test()

    public void test_Home_Page_Appear_Correct() {

        //Create Login Page object
        objLogin = new Login(driver);

        //Verify login page title
        String loginPageTitle = objLogin.getLoginTitle();
        System.out.println(loginPageTitle.toLowerCase());
        Assert.assertEquals(loginPageTitle,"Log into Facebook");

        // login to WebPage
        objLogin.loginToWebPage("yourusername@gmail.com", "yourpassword");

        // Go the next page
        objHomePage = new Home(driver);

        // Verify home page uploaded
        System.out.println("Logged in as: " + objHomePage.getHomePageDashboardUserName());
        Assert.assertEquals(objHomePage.getHomePageDashboardUserName(),"Maor Segev");

    }
}