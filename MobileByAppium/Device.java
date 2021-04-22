package mobilebyappium;

/**
 * Created by Maor on 4/12/2018.
 */
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by Maor S on 30/08/2017.
 */
public class Device extends setUp {

    @Test
    public void testUntitled() {
        driver.swipe(372, 912, 412, 106, 2435);
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Storage']]")).click();
        driver.findElement(By.xpath("//*[@text='getStorageInfo']")).click();
        driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
        driver.findElement(By.xpath("//*[@text='clearCache']")).click();
        driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
        driver.findElement(By.xpath("//*[@text='getExternalStoragePerformance']")).click();
        driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
        driver.findElement(By.xpath("//*[@text='getRemovableStorage']")).click();
        driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Sound']]")));
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Sound']]")).click();
        driver.findElement(By.xpath("//*[@text='sendReport']")).click();
        driver.swipe(460, 858, 450, 1131, 4457);
        driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@text='Mandatory fields']]")).click();
        driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and ./*[@text='Sound']]")).click();
    }


    @Test (priority = 1)
    public void getDeviceInfo() {

        // findElement(By.xpath) and takeScreenShot for the JSON result
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")).click();
        driver.findElement(By.id("android:id/alertTitle"));

        // Check if test finished with JSON's result or with an error
        String result = driver.findElement(By.id("android:id/alertTitle")).getText();
        assert result.equals("Test Finished") : "Test Finished did not match with Actual test result: " + result;

        // Print the JSON's test results
        String result2 = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(result2);

        // Go back to main  app categories screen
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKeyCode(AndroidKeyCode.BACK);

    }

    @Test (priority = 3)
    public void getDeviceUniqId() {
        // findElement(By.xpath)
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView\n")).click();
        driver.findElement(By.id("android:id/alertTitle"));

        // Check if test finished with JSON's result or with an error
        String result = driver.findElement(By.id("android:id/alertTitle")).getText();
        assert result.equals("Test Finished") : "Test Finished did not match with Actual test result: " + result;

        // Print the JSON's test results
        String result2 = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(result2);

        // Go back to main  app categories screen
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKeyCode(AndroidKeyCode.BACK);

    }

    @Test (priority = 2)
    public void getRooted() {
        // findElement(By.xpath)
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView\n")).click();
        driver.findElement(By.id("android:id/alertTitle"));

        // Check if test finished with JSON's result or with an error
        String result = driver.findElement(By.id("android:id/alertTitle")).getText();
        assert result.equals("Test Finished") : "Test Finished did not match with Actual test result: " + result;

        // Print the JSON's test results
        String result2 = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(result2);

        // Go back to main  app categories screen
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKeyCode(AndroidKeyCode.BACK);

    }

    @Test (priority = 4)
    public void getCPUPerformance() {
        // findElement(By.xpath)
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]\n")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.TextView\n")).click();
        driver.findElement(By.id("android:id/alertTitle"));

        // Check if test finished with JSON's result or with an error
        String result = driver.findElement(By.id("android:id/alertTitle")).getText();
        assert result.equals("Test Finished") : "Test Finished did not match with Actual test result: " + result;

        // Print the JSON's test results
        String result2 = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(result2);

        // Go back to main  app categories screen
        driver.findElement(By.id("android:id/button1")).click();
        driver.pressKeyCode(AndroidKeyCode.BACK);

    }

    @AfterTest
    public void End() {
        driver.quit();
    }

}





