package corejava.accessmodifiers;

/**
 * Created by Maor on 5/25/2018.
 */
public class ProtectedClassFive extends ProtectedClassFour {

    public static void main(String args[]){
        ProtectedClassFive obj = new ProtectedClassFive();
        System.out.println(obj.myMethod(100));
    }

}
