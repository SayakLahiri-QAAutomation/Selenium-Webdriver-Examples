package corejava.files;

/**
 * Created by Maor on 5/21/2018.
 * To read a text file, we use FileReader and wrap it in a BufferedReader.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) {
        try {
            // FileReader is meant for reading streams of characters
            FileReader reader = new FileReader("C:\\Users\\Maor\\Desktop\\data driven\\FileRead.txt");
            // BufferedReader reads text from a character-input stream
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            // Close the BufferedReader object to prevent memory leak
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
