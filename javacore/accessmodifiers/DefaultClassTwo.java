package corejava.accessmodifiers;

/**
 * Created by Maor on 5/25/2018.
 */
public class DefaultClassTwo {

    public static void main(String args[]){
        // Created an object of ClassOne
        DefaultClassOne obj = new DefaultClassOne();
        // Trying to access the default method of ClassOne which is in packageOne
        // You can find an error at obj.myMethod

        obj.myMethod(10);

    }
}
