package corejava.interfaces;

/**
 * Created by Maor on 6/3/2018.
 */

public class MyClass1 implements MyInterfaceTwo {

    public static void main(String [] args){
        MyInterfaceTwo obj = new MyClass1();
        obj.myMethodOne();
        obj.myMethodTwo();
    }

    // If you comment below two methods, you can see a compilation error
	/*This class is just implementing MyInterfaceTwo but
	it has to implement all the methods of MyInterfaceTwo and MyInterfaceOne as well
	because MyInterfaceTwo extends MyInterfaceOne*/

    @Override
    public void myMethodOne() {

        System.out.println("Implementation of myMethodOne");

    }

    @Override
    public void myMethodTwo() {

        System.out.println("Implementation of myMethodTwo");

    }
}
