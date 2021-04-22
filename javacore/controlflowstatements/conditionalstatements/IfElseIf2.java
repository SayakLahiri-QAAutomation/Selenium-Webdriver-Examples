package corejava.controlflowstatements.conditionalstatements;

/**
 * Created by Maor on 5/23/2018.
 */

public class IfElseIf2 {

    public static void main(String[] args) {

        int marks = 76;
        char grade;

        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

    }
}
