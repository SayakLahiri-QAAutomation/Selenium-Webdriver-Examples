package corejava.miscellaneous;

/**
 * Created by Maor on 5/20/2018.
 Method Overloading is to define two or more methods of same name in a class,
 provided that there argument list or parameters are different.
 This increases the readability of the program.
 Suppose you have to perform addition of the given numbers but there can be any number
 of arguments, if you write the method such as addTwoNos(int,int) for two parameters,
 and addThreeNos(int,int,int) for three parameters then it may be difficult for you as
 well as other programmers to understand the behavior of the method because their name
 differs. So, we perform method overloading to figure out the program quickly.
 */


/*In this example, we have created two overloaded methods, first sum method
performs addition of two numbers and second sum method performs addition of three numbers.*/

public class Calculation {

    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String args[]){
        Calculation obj=new Calculation();
        obj.sum(10,10,10);
        obj.sum(20,20);
    }
}
