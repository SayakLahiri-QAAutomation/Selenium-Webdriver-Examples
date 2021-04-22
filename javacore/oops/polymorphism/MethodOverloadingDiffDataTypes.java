package corejava.oops.polymorphism;

/**
 * Created by Maor on 5/26/2018.
 */

// Overload a method with Parameters with different data types
public class MethodOverloadingDiffDataTypes {

    public void methodOne(int a){
        System.out.println(a);
    }

    public void methodOne(String a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) {

        MethodOverloadingDiffDataTypes obj = new MethodOverloadingDiffDataTypes();

        obj.methodOne(10);
        obj.methodOne("My name is Maor Segev");

    }
}
