package corejava.controlflowstatements.conditionalstatements;

/**
 * Created by Maor on 5/19/2018.
 */
/*
A switch statement allows a variable to be tested against a list of values.
Each value is called a case and the variable is being checked for each case.*/

public class SwitchCase {

    public static void main(String args[]){
        char grade = 'D';
        switch(grade)
        {
            case'A':
                System.out.println("Excellent");
                break;
            case'B':
                System.out.println("Very good!");
                break;
            case'C':
                System.out.println("Well done");
                break;
            case'D':
                System.out.println("You passed");
                break;
            case'F':
                System.out.println("You fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
