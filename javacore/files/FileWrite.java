package corejava.files;

/**
 * Created by Maor on 5/21/2018.
 * Write text to a file using BufferedWriter
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("C:\\Users\\Maor\\Desktop\\data driven\\FileWrite.txt");
            // BufferedWriter writes text to a character-output stream, buffering characters
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Test Selenium");
            bufferedWriter.newLine();
            bufferedWriter.write("Test Appium");

            System.out.println("Wrote to file in path C:\\Users\\Maor\\Desktop\\data driven\\FileWrite.txt");

            // Close the BufferedWriter object to prevent memory leak
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
