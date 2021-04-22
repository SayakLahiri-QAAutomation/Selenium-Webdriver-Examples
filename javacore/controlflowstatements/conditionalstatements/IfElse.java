package corejava.controlflowstatements.conditionalstatements;

/**
 * Created by Maor on 5/19/2018.
 */

/*
if statement can be followed by an optional else statement,
which executes when the condition mentioned is false.
*/

public class IfElse {

    public static void main(String args[]){

        int x = 30;
        if(x < 20){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}
