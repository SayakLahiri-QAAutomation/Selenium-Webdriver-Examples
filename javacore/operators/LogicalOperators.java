package corejava.operators;

/**
 * Created by Maor on 5/23/2018.
 */
public class LogicalOperators {

    public static void main(String[] args) {

        boolean booleanVal1 = true;
        boolean booleanVal2 = false;

        // && - AND
        System.out.println("Output of AND is "+ (booleanVal1&&booleanVal2));
        // || - OR
        System.out.println("Output of OR is "+ (booleanVal1||booleanVal2));
        // ! - NOT
        System.out.println("Output of NOT is "+ (!booleanVal1));
    }
}
