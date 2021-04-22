package corejava.accessmodifiers;

/**
 * Created by Maor on 5/25/2018.
 */
public class PrivateClassTwo {

    public static void main(String args[]){
        PrivateClassOne obj = new PrivateClassOne();

        // Here I am trying to access the private data member
        // and private method of ClassOne
        // It throws compilation error

/*        System.out.println(obj.x);
        System.out.println(obj.myMethod(1000));*/

        // Here I am trying to access default data member
        // and default method of ClassOne
        // No error. We can comfortable access default modifier
        // with in the package
        System.out.println(obj.y);
        System.out.println(obj.myMethodOne(2000));

    }
}
