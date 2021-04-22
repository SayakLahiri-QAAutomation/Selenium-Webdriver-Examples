package corejava.controlflowstatements.Iterationstatements;

/**
 * Created by Maor on 5/19/2018.
 */


/* A while loop is a control structure that allows you to repeat a task for certain
number of times.
When executing, if the condition is true, then the actions inside the loop
will be executed.This will continue as long as the condition is true.*/

public class While{

    public static void main(String args[]){

        int x = 1;

        while( x <= 10){
            System.out.println("" + x );
            x++;
        }
    }
}
