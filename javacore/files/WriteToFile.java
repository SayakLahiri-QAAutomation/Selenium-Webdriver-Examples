package corejava.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Maor on 5/23/2018.
 * Create a new file and write text to it using BufferedWriter
 */

public class WriteToFile {

    public static void main(String[] args) throws IOException {
        String textToWrite =
                "I am learning Selenium 1 " +
                "I am learning Selenium 2 " +
                "I am learning Selenium 3 " +
                "I am learning Selenium 4 " +
                "I am learning Selenium 5 ";

		/* BufferedWriter writes text to a character-output stream, buffering characters
		   so as to provide for the efficient writing of single characters, arrays, and strings. */

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Maor\\Desktop\\data driven\\FileRead.txt"));
        writer.write(textToWrite);

        // Close the BufferedWriter object to prevent memory leak
        writer.close();
    }
}
