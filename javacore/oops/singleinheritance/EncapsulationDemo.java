package corejava.oops.singleinheritance;

/**
 * Created by Maor on 5/20/2018.
 Encapsulation is mechanism where we encapsulate the data (variables)
 and code acting on the data (methods) together as a single unit.
 In encapsulation, the variables of a class will be hidden from
 other classes, and can be accessed only through the methods of their
 current class. Therefore, it is also known as data hiding.
 To achieve encapsulation we need to declare the variables of
 a class as private and have to provide public setter and getter
 methods to modify and view the variables values.
 */
public class EncapsulationDemo {

    private String id;
    private String name;

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setId( String newId) {
        id = newId;
    }

    public void setName(String newName) {
        name = newName;
    }
}
