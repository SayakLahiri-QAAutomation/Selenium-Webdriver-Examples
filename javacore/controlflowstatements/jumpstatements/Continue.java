package corejava.controlflowstatements.jumpstatements;

/**
 * Created by Maor on 5/24/2018.
 */

public class Continue {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++)
        {
			/*
			 * if i value is equal to 4 then the control goes to continue statement and
			 * the control jumps at the beginning of for loop for next iteration without
			  * executing print statement.
			 * So, the output "Value of i is 4" wont display in the console. */

            if (i==4)
            {
                continue;
            }

            System.out.println(""+i);

        }

    }
}
