package corejava.exceptionhandling;

/**
 * Created by Maor on 5/20/2018.
 Exception handling Using try and catch:
 Try is used to guard a block of code in which exception may occur.
 This block of code is called guarded region.
 A catch statement involves declaring the type of exception
 you are trying to catch. If an exception occurs in guarded code,
 the catch block that follows the try is checked, if the type of
 exception that occured is listed in the catch block then the exception
 is handed over to the catch block which then handles it.
 */
public class ExceptionDemo {

        public static void main(String args[])
        {
            int a,b,c;
            try
            {
                a=0;
                b=10;
                c=b/a;
                System.out.println("This line will not be executed since Exception occuer and we than" +
                        "jump to the catch block ");
            }catch(ArithmeticException e)
            {
                System.out.println("Exception was caught: " + e);
            }
            System.out.println("After exception is handled program continue...");
        }
}
