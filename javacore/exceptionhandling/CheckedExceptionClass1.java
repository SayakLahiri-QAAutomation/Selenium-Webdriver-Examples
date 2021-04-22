package corejava.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Maor on 5/26/2018.
 */

public class CheckedExceptionClass1 {

        public static void main(String[] args) {

            try {
                FileInputStream fis = new FileInputStream("D:/TestFile.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
