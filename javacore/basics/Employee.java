package corejava.basics;

/**
 * Created by Maor on 5/18/2018.
 A class is a group of objects that has common properties.
 It is a template or blueprint from which objects are created.

 Template of class:
 class <class_name>{
 data members (Variable) ;
 methods;

 Variable
 is a name of memory location where the value is stored.
 Each variable in Java has a specific type which determines the size
 and layout of the variable's memory, the range of values that can be
 stored within that memory, and the set of operations that can be applied to the variable

 Objects
 In real-world, we see many objects around us like cars,
 dogs, cats etc. All these objects have a state and a behavior.
 An object is an instance of a class i.e. an object is created from a class

 Constructor
 Constructor is used to create the objects. new keyword always call constructor
 of the class in the java code.
 Every class has a constructor.
 If we do not explicitly write a constructor for a class then Java compiler builds
 a default constructor for that class.
 Each time a new object is created, at least one constructor will be invoked.
 The constructors have the same name as the class.
 A class can have more than one constructor.
 Constructor is use to assign values to instance variables.
 Constructor does not have return type.

 */

public class Employee{

    // Variables
    public String name;
    public char gender;
    public boolean married;
    public double salary;

    public static void main(String args[]){

        // Employee Constructor to create the Employee object
        Employee emp1 = new Employee("Maor");

        // Employee Constructor is used to assign values to the instance variables
        emp1.setSalary(1000);
        emp1.setGender('m');
        emp1.setMarried(true);
        emp1.printEmpDetails();
    }

    // Getters and Setters

    public Employee (String empName){
        name = empName;
    }

    public void setSalary(double empSal){
        salary = empSal;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    //  Methods i.e functions that perform an actions
    // This method prints the employee details

    public void printEmpDetails(){
        System.out.println("Employee name : " + name );
        System.out.println("Employee gender :" + gender);
        System.out.println("Employee salary :" + salary);
        System.out.println("Employee married :" + married);

    }
}