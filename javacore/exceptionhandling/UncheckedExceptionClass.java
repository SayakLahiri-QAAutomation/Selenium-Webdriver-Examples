package corejava.exceptionhandling;

/**
 * Created by Maor on 5/26/2018.
 */

public class UncheckedExceptionClass {

    public static void main(String [] args){
        int a=100;
        int b=0;

        try {
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
