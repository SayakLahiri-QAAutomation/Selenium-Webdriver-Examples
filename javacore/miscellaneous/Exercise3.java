package corejava.miscellaneous;

/**
 * Created by Maor on 5/22/2018.
 * Java Exercise 3: Add All Elements in Array
 */

public class Exercise3 {

    // To generate main Type "psvm" and press Tab
    public static void main(String[] args) {
    int anumbers [] = {1,2,3,4,5};
    int sum = 0;
        for(int i = 0; i< anumbers.length; i++){
            sum = sum + anumbers[i];
            System.out.println(sum);
        }
    }
}