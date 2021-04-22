package corejava.miscellaneous;

/**
 * Created by Maor on 5/22/2018.
 */

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // Creating an instance "userInput" of a Scanner class
        Scanner userInput = new Scanner(System.in);

        System.out.println("Learning Java from?");
        // Using nextLine method to get the input and move the cursor to the new line
        String website = userInput.nextLine();
        // Close the scanner object using close() method to prevent memory leak
        userInput.close();
        System.out.println("I am learning Java from " + website);
    }
}