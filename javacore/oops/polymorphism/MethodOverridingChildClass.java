package corejava.oops.polymorphism;

/**
 * Created by Maor on 5/25/2018.
 */
/*
 With method overriding, a child class can give its own specific implementation
 to an inherited method without modifying the parent class method.
 Assume we have multiple child classes. In case one of the child classes want to
 use the parent class method and other class want to use their own
 implementation then we can use overriding feature.*/

public class MethodOverridingChildClass extends MethodOverridingParentClass {

        public void myMethod(){
            System.out.println("I am a method from the Child Class");
        }

        public static void main(String [] args){

            MethodOverridingParentClass obj = new MethodOverridingChildClass();
            // It calls the child class method myMethod()
            obj.myMethod();

        }
}
