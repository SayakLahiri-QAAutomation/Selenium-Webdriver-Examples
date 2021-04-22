package corejava.exceptionhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

/**
 * Created by Maor on 5/16/2018.
 */

public class JavaErrosExample {

    // Assertion Error example
    @Test
    public void AssertionError() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://stackoverflow.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("display-name")).clear();
        driver.findElement(By.id("display-name")).sendKeys("J.Doe");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("you@example.com");
        driver.findElement(By.id("submit-button")).click();
        assertEquals("Password cannot",driver.findElement(By.className("message-text")).getText());
        Thread.sleep(5);
    }

    @Test
    // The OutOfMemoryError is thrown by JVM i.e. when JVM
    // does not have enough available memory to allocate
    public void OutOfMemoryError () throws InterruptedException {

        int dummyArraySize = 15;
        System.out.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
        long memoryConsumed = 0;
        try
        {
            long[] memoryAllocated = null;
            for (int loop = 0; loop < Integer.MAX_VALUE; loop++) {
                memoryAllocated = new long [dummyArraySize];
                memoryAllocated[0] = 0;
                memoryConsumed += dummyArraySize * Long.SIZE;
                System.out.println("Memory Consumed till now: " + memoryConsumed);
                dummyArraySize *= dummyArraySize * 2;
                Thread.sleep(500);
            }
        }
        catch (OutOfMemoryError outofMemory)
        {
            System.out.println("Exception was caught: " + outofMemory);
            throw outofMemory;
        }
    }
}
