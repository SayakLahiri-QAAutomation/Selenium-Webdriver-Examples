package corejava.exceptionhandling;

/**
 * Created by Maor on 5/20/2018.
 Multiple catch blocks:
 A try block can be followed by multiple catch blocks.
 You can have any number of catch blocks after a single try block.
 If an exception occurs in the guarded code the exception is passed to the first catch block in the list.
 If the exception type of exception, matches with the first catch block it gets caught, if not the exception is passed down to the next catch block.
 This continue until the exception is caught or falls through all catches.
 */

public class ExceptionDemo2 {

    public static void main(String[] args)
    {
        try {
            int a[] = {1, 2};
            a[2] = 3 / 0;
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception was caught: " + e);

        }catch(ArithmeticException e)
            {
                System.out.println("Exception was caught: " + e);
            }
        }
    }

