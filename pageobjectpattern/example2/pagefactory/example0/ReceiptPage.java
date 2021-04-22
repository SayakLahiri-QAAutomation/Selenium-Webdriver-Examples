package pageobjectpattern.example2.pagefactory.example0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Maor on 6/8/2018.
 */

public class ReceiptPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement header;

    public ReceiptPage(WebDriver driver) {
        super(driver);
    }

    public String confirmationHeader(){
        return header.getText();
    }
}