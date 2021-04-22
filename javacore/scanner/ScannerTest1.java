package scanner;

/**
 * Created by Maor on 5/22/2018.
 * We use “Scanner” class to accept input from the user (in run-time)
 */

import java.util.Scanner;

public class ScannerTest1 {

    public static void main(String[] args) {

        // Creating an instance "userInput" of a Scanner class
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please specify Selenium website:");

        // Using nextLine method to get the input and move the cursor to the new line
        String website = userInput.nextLine();

        // Close the scanner object using close() method to prevent memory leak
        userInput.close();
        System.out.println("I am learning Selenium from " + website);
    }
}