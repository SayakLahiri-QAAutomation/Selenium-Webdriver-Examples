package corejava.oops.hierarchialInheriance0;

/**
 * Created by Maor on 5/25/2018.
 */

public class InheritanceTest {

    public static void main(String args[]){

        // Class B extends Class A
        // Class C extends Class A
        // Here I am creating an instance of ClassC

        ClassC obj = new ClassC();

        // Using object of ClassC, I can call methods of ClassA and ClassC..
        // Its just because ClassC extends ClassA
        // Here ClassB can't call methods of ClassB because
        // there is no relation between ClassC and ClassB

        obj.methodOneClassA();
        obj.methodOneClassC();

    }
}
