package capturescreenshot;

/**
 * Created by Maor on 31/03/2018.
 */

import org.testng.annotations.Test;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CaptureScreenshotUsingRobotClass {

    @Test
    public static void CaptureScreenshot () throws Exception
    {
        // Capture screenshot of current screen
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        // Store screenshot on Specific location
        ImageIO.write(image, "png", new File("C:\\Users\\Maor\\Desktop\\Selenium\\Robot.png"));
    }
}
