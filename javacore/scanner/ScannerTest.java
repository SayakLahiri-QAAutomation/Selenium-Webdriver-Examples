package scanner;

/**
 * Created by Maor on 6/3/2018.
 * We use “Scanner” class to accept input from the user (in run-time)
 */

import java.util.Scanner;

public class ScannerTest {

    public static void main(String args[]){

        // Create the Scanner object
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your ID: ");
        int rollno=sc.nextInt();

        System.out.println("Enter your First Name: ");
        String name=sc.next();

        System.out.println("Enter your Gender: ");
        String Gender=sc.next();

        System.out.println("Enter your Fee: ");
        Double fee= Double.valueOf(sc.next());

        // Print all user input to the console
        System.out.println("Student ID:" + rollno +" Student name: "+name + " Student Gender:" + Gender + " Fee: " + fee);

        // Close the Scanner
        sc.close();
    }
}
