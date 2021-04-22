package corejava.operators;

/**
 * Created by Maor on 5/23/2018.
 */

public class AssignmentOperators {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 50;

        // Assigning value of variable num2 to the variable num1
        num1 = num2;
        System.out.println("Output of num1 = num2 is "+ num1);

        // num1 = num1+num2
        num1 += num2;
        System.out.println("Output of num1 = num1+num2 is "+ num1);

        // num1 = num1-num2
        num1 -= num2;
        System.out.println("Output of num1 = num1-num2 is "+ num1);

        // num1 = num1*num2
        num1 *= num2;
        System.out.println("Output of num1 = num1*num2 is "+ num1);

        // num1 = num1/num2
        num1 /= num2;
        System.out.println("Output of num1 = num1/num2 is "+ num1);

        // num1 = num1%num2
        num1 %= num2;
        System.out.println("Output of num1 = num1%num2 is "+ num1);

    }
}
