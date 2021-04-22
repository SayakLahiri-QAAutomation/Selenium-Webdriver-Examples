package corejava.interfaces;

/**
 * Created by Maor on 5/20/2018.
 Interface:
 An interface in java is a blueprint of a class.
 Its collection of abstract methods means all the methods in interface are
 abstract methods.
 Along with abstract methods, an interface may also contain constants,
 default methods, static methods, and nested types.
 The interface in java is a mechanism to achieve fully abstraction.
 It cannot be instantiated just like abstract class.
 */

interface Demo{

     void display();
     void run();
}

class TestClass implements Demo{

    public void display(){
        System.out.println("Call Dispaly Method");
    }

    public void run(){
        System.out.println("Call Run Method");
    }

    public static void main(String args[]){
        TestClass obj = new TestClass();
        obj.display();
        obj.run();
    }
}