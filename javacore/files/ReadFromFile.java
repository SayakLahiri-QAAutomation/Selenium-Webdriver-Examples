package corejava.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Maor on 5/23/2018.
 * To read a text file, we use FileReader and wrap it in a BufferedReader.
 */
public class ReadFromFile {

    public static void main(String[] args) throws IOException {

        // FileReader is meant for reading streams of characters.
        FileReader fileReader = new FileReader("C:\\Users\\Maor\\Desktop\\data driven\\FileRead.txt");

        /* BufferedReader reads text from a character-input stream, buffering characters
	    so as to provide for the efficient reading of characters, arrays, and lines. */
        BufferedReader bufferReader = new BufferedReader(fileReader);

        String textfromfile = null;

        // Using while loop to read the file until there are no more lines
        while( (textfromfile = bufferReader.readLine()) != null ){
            System.out.println(textfromfile);
        }
        fileReader.close();
        // Close the BufferedReader object to prevent memory leak
        bufferReader.close();
    }
}


