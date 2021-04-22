package corejava.oops.polymorphism;

/**
 * Created by Maor on 5/26/2018.
 */

// Overload a method with Different number of parameters
public class MethodOverloadingDiffParameters {

    public void methodOne(int a){
        System.out.println("Single Argument Method " + a);
    }

    public void methodOne(int a, int b)
    {
        System.out.println("Multiple Argument Method " + a + "," + b);
    }

    public static void main(String[] args) {

        MethodOverloadingDiffParameters obj = new MethodOverloadingDiffParameters();

        obj.methodOne(10);
        obj.methodOne(10, 20);

    }
}
