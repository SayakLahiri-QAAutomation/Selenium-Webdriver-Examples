package corejava.oops.singleinheritance;

/**
 * Created by Maor on 5/20/2018.
 Method Overriding
 Child class has the same method as of base class. In such cases child class
 overrides the parent class method without even touching the source code of the base class.
 In this process, an overridden method is called through the reference variable of
 a superclass. The determination of the method to be called is based on the object being
 referred to by the reference variable.
 Method overriding applies only to inherited methods.
 Overriding method can have different return type.
 Static and final methods cannot be overridden.
 Constructors cannot be overridden.
 */

public class ParentClass {

    public void status(){
        System.out.println("Parent's Method");
    }
}
