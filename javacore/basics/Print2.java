package corejava.basics;

/**
 * Created by Maor on 5/22/2018.
 */

public class Print2 {

    // Declaring a variable named website and print some text and go to new line
    static String javaWeb = "https://www.java.com";
    static String pythonWeb = "https://www.python.org";

    public static void main(String [] args){

        /* Print text and go to new line
         we use "+" to concatenate website with the given text*/
        System.out.println("Start Java from " + javaWeb);
        System.out.println("Start python from " + pythonWeb);
    }
}
