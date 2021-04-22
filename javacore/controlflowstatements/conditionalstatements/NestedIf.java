package corejava.controlflowstatements.conditionalstatements;

/**
 * Created by Maor on 6/2/2018.
 */


public class NestedIf {

    public static void main(String[] args) {

        int num = 10;

        if (num <=10){
            System.out.println("True " +num);

            if (num >20){
                System.out.println("False "+num);
            }
        }
    }
}
