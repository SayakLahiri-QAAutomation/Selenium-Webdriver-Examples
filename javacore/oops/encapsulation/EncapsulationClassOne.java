package corejava.oops.encapsulation;

/**
 * Created by Maor on 5/26/2018.
 */

public class EncapsulationClassOne {

    // Variables declared as private
    // These private variables can only be accessed by public methods of a class
    private int age;
    private String name;

    // getter method to access private variable
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    // setter method to access private variable
    public void setAge(int inputAge){
        age = inputAge;
    }

    public void setName(String inputName){
        name = inputName;
    }
}
