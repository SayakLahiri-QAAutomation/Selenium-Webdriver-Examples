package pageobjectpattern.example2.pagefactory.example0;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Maor on 6/8/2018.
 */

public class SignUpFormTest extends ManageWebDriver {

    @Test
    public void signUp() {
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterName("First", "Last");
        signUpPage.enterAddress("123 Street", "12345");
        ReceiptPage receiptPage = signUpPage.submit();
        assertEquals("Thank you!", receiptPage.confirmationHeader());
    }

    @Test
    public void OtherTest1() {
       // code here
    }

    @Test
    public void OtherTest2() {
        // code here
    }
}