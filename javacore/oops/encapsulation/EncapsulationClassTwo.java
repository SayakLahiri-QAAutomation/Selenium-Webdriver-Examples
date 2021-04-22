package corejava.oops.encapsulation;

/**
 * Created by Maor on 5/26/2018.
 */

public class EncapsulationClassTwo {

    public static void main(String [] args){

        EncapsulationClassOne obj = new EncapsulationClassOne();

        // Setting values of the variables
        obj.setAge(25);
        obj.setName("David");
        
        // Using getters to get the values of the variables
        System.out.println("My name is " + obj.getName());
        System.out.println("My age is " + obj.getAge());

    }
}
