package corejava.miscellaneous;

/**
 * Created by Maor on 5/20/2018.
 */

/*In this example, we have created two overloaded methods that differs in data type.
The first sum method receives two integer arguments and second sum method receives
two double arguments.*/

public class Calculation2 {

    void sum(int a,int b){
        System.out.println(a+b);
    }

    void sum(double a,double b){
        System.out.println(a+b);
    }

    public static void main(String args[]){
        Calculation2 obj=new Calculation2();
        obj.sum(20,20);
        obj.sum(10.5,10.5);
    }
}
