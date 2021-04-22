package corejava.operators;

/**
 * Created by Maor on 5/23/2018.
 */
public class TernaryOperators {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 50;

        int val1=(num1>num2)?num1:num2;
        System.out.println(val1);

        int val2=(num1<num2)?num1:num2;
        System.out.println(val2);

    }
}
