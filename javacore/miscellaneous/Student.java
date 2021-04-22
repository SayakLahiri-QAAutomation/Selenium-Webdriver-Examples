package corejava.miscellaneous;

/**
 * Created by Maor on 5/20/2018.
 Suppose there are 500 students in my college, now all instance data members will
 get memory each time when object is created.All student have its unique rollno
 and name so instance data member is good.Here, college refers to the common property
 of all objects.If we make it static,this field will get memory only once.
 */

public class Student {

    int rollno;
    String name;
    static String college = "Open university";

    Student(int r,String n){
        rollno = r;
        name = n;
    }

    void display (){
        System.out.println(rollno + " " + name +" " + college);
    }

    public static void main(String args[]){
        Student s1 = new Student(111,"Maor" + "->");
        Student s2 = new Student(222,"Or" + "->");

        s1.display();
        s2.display();
    }
}

