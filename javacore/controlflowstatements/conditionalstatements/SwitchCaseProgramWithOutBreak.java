package corejava.controlflowstatements.conditionalstatements;

/**
 * Created by Maor on 6/2/2018.
 */

// WithOutBreak - In this example case 2 and default will be executed.
public class SwitchCaseProgramWithOutBreak {

    public static void main(String[] args) {

        int num = 200;
        switch (num) {

            case 100:
                System.out.println("Value of Case 1 is " + num);
            case 200:
                System.out.println("Value of Case 2 is " + num);
            default:
                System.out.println("Value of default is " + num);

        }
    }
}
