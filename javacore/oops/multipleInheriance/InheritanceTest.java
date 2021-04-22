package corejava.oops.multipleInheriance;

/**
 * Created by Maor on 5/25/2018.
 */

public class InheritanceTest {
    public static void main(String args[]){

        // Class B extends Class A
        // Class C extends Class B
        // Here I am creating an instance of ClassC

        ClassC obj = new ClassC();

        // Using object of ClassC, I can call methods of ClassA, ClassB and ClassC..
        // Its just because ClassB extends ClassA and ClassC extends ClassB

        obj.methodOneClassA();
        obj.methodOneClassB();
        obj.methodOneClassC();

    }
}
