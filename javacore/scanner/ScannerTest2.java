package scanner;

/**
 * Created by Maor on 6/3/2018.
 */

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {

    // Creating an instance "userInput" of a Scanner class
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter your Name: ");
    String name = userInput.nextLine();

    System.out.println("Enter your Gender: ");
    char gender = userInput.next().charAt(0);

    System.out.println("Enter your Age: ");
    int age = userInput.nextInt();

    System.out.println("Enter your Mobile number: ");
    long mobileNo = userInput.nextLong();

    System.out.println("Enter your Salary: ");
    double Salary = userInput.nextDouble();

    // Print the values entered by the user
    System.out.println("Name: "+ name);
    System.out.println("Gender: "+ gender);
    System.out.println("Age: "+ age);
    System.out.println("Mobile Number: "+ mobileNo);
    System.out.println("Salary: "+ Salary);

    }
}



