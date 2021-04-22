package pageobjectpattern.example2.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Maor on 6/6/2018.
 *  Page Object Model Example
 */

public class Login {

    WebDriver driver;

    By userName = By.name("email");
    By password = By.name("pass");
    By titleText = By.className("_50f6");
    By login = By.name("login");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    // Set user name in textbox
    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);

    }

    // Set password in password textbox
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);

    }

    // Click on login button
    public void clickLogin(){
        driver.findElement(login).click();

    }

    // Get the title of Login Page
    public String getLoginTitle(){
        return
                driver.findElement(titleText).getText();

    }

    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPasword
     * @return
     */

    public void loginToWebPage(String strUserName,String strPasword){
        //Fill user name
        this.setUserName(strUserName);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickLogin();
    }
}