package corejava.controlflowstatements.conditionalstatements;

/**
 * Created by Maor on 5/19/2018.
 */

/* An if statement can be followed by an optional else if...else statement,
which is very useful to test various conditions using single if...else if statement.*/

public class IfElseIf{

    public static void main(String args[]){

        int x = 30;

        if( x == 10){
            System.out.print("Value of X is 10");
        }else if(x == 20){
            System.out.print("Value of X is 20");
        }else if( x == 30){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("This is else statement");
        }
    }
}
