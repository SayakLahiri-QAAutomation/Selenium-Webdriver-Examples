package corejava.oops.singleinheritance;

/**
 * Created by Maor on 5/20/2018.
 */
public class ChildClass extends ParentClass {

    public void status(){
        System.out.println("Child's Method");
    }

    public static void main(String args[]){

        //Creating objects
        ParentClass parent = new ParentClass();
        ParentClass parent_1 = new ChildClass();
        ChildClass child = new ChildClass();


        parent.status();    // This will print Parent's status method
        child.status();  // This will print child's status method
        parent_1.status();  // This will print child's status method
    }
}
