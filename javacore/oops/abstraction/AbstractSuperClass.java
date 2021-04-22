package corejava.oops.abstraction;

/**
 * Created by Maor on 5/26/2018.
 * We use abstraction when we know that our class should have some methods
 * but we are not sure how exactly those methods should function. Assume,
 * I am creating a class of Vehicle which should have a method called start().
 * There will be some other subclass of this Vehicle class such as Car,
 * Bike and these two subclasses use start() method. But the implementation
 * of start() method in Car is different from Bike. So in this case I don’t
 * implement the start() method in Vehicle class but implement those in the subclasses.
 */

// AbstractSuperClass is an abstract class
public abstract class AbstractSuperClass {

    // data members cant be abstract
    public int i = 10;

    // myMethod() is an abstract method
    abstract void myMethod();

    // myMethod(int i) is not an abstract method. Its a concrete method
    void myMethod(int i){
        System.out.println("I am in Super class and I am not an abstract method. I am a concrete method");
    }
}