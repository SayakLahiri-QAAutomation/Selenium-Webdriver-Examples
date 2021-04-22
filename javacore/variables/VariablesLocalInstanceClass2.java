package corejava.variables;

/**
 * Created by Maor on 5/23/2018.

 Local Variable:
 Local variable is a variable which we declare inside a Method.
 A method will often store its temporary state in local variables.

 Instance Variable (Non-static):
 Instance variable is a variable which is declared inside a Class but outside a Method.
 We don’t declare this variable as Static because these variables are non-static variables.

 Class Variable (Static):
 Class variable is a variable which is declared as Static. Additionally, the keyword final
 could be added to include that the value will never change.
 */

public class VariablesLocalInstanceClass2 {

    static int staticVar = 100; // static variable
    int instanceVar = 200; // instance variable

    public static void main(String [] args){

        int localVar = 300; // local variable

        // We can access static variables without creating an Object of a class
        System.out.println("Value of a Static Variable is "+ staticVar);

        // Creating an instance of a class 'VariablesLocalInstanceClass2'
        VariablesLocalInstanceClass2 var = new VariablesLocalInstanceClass2();
        System.out.println("Value of a Instance Variable is "+ var.instanceVar);
        System.out.println("Value of a Local Variable is "+ localVar);

    }

}
