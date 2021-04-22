package corejava.controlflowstatements.conditionalstatements;

/**
 * Created by Maor on 5/19/2018.
 */

/*A do...while loop is similar to a while loop, except that a do...while
loop is guaranteed to execute at least one time.
The condition appears at the end of the loop, so the statements in
the loop execute once before the condition is tested.
If the condition is true, the flow of control jumps back up to do,
and the statements in the loop execute again. This will
continue as long as the condition is true.*/


public class DoWhile2 {

    public static void main(String args[]){

        int x = 1;

        do{
            System.out.println("" + x );
            x++;
        } while( x <=10);
    }
}
