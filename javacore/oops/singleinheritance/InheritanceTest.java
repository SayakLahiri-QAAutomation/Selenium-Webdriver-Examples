package corejava.oops.singleinheritance;

/**
 * Created by Maor on 5/25/2018.
 */

public class InheritanceTest {

    public static void main(String args[]){

        // Class B extends Class A
        // Here I am creating an instance of ClassB

        ClassB obj = new ClassB();

        // Using object of ClassB, I can call methods of ClassA and ClassB..
        // Its just because ClassB extends ClassA

        obj.methodOneClassA();
        obj.methodOneClassB();

    }
}
