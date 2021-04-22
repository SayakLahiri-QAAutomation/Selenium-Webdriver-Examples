package corejava.controlflowstatements.Iterationstatements;

/**
 * Created by Maor on 5/19/2018.
 */

/*for loop is a repetition control structure that execute a specific number of times.
for loop is useful when you know how many times a task is to be repeated.*/

/*
int i = 1; //Initialization
i<=10; // Condition (Boolean expression)
i++ // Decrement or Increment operation
*/

public class For {

    public static void main(String args[]){

        for(int x = 1; x <= 10; x = ++x){ // ++x is the same as x+1
            System.out.println(""+ x );
        }
    }
}
