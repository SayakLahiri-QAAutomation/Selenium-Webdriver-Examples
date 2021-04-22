package corejava.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Maor on 5/26/2018.
 */

// handle Exception using throws keyword
public class CheckedExceptionClass {

    public static void main(String [] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("D:/TestFile.txt");

    }
}
