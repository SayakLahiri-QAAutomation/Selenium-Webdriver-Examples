package pageobjectpattern.example2.pageobjectmodel;

/**
 * Created by Maor on 6/9/2018.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Maor on 6/6/2018.
 * Page Object Model Example
 */

// Home Page after successful log-in
public class Home {

    WebDriver driver;
    By homePageUserName = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/ul/li/a/div");

    public Home(WebDriver driver){
        this.driver = driver;

    }

    // Get the User name from Home Page
    public String getHomePageDashboardUserName() {
        return driver.findElement(homePageUserName).getText();

    }
}