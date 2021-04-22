package corejava.exceptionhandling;

/**
 * Created by Maor on 5/20/2018.
 */

import java.io.*;

public class ThrowsExample {

    public static void main(String[] args) throws IOException {
            FileWriter file = new FileWriter("c:\\Data1.txt");
            file.write("Maor Segev");
            file.close();
        }
    }
