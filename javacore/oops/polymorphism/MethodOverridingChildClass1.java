package corejava.oops.polymorphism;

/**
 * Created by Maor on 6/3/2018.
 */


public class MethodOverridingChildClass1 extends MethodOverridingParentClass{

    public void myMethod(){
        System.out.println("I am a method from Child Class");
    }

    public static void main(String [] args){

		/* When parent class reference refers to the child class object
		 * then the method of the child class (overriding method) is called.
		 * This we call as runtime polymorphism
		 */
        MethodOverridingParentClass obj = new MethodOverridingChildClass();
        // It calls the child class method myMethod()
        obj.myMethod();


		/* When Parent class reference refers to the parent class object
		 * then the method of parent class (overriden method) is called.
		 */
        MethodOverridingParentClass obj1 = new MethodOverridingParentClass();
        obj1.myMethod();

    }
}