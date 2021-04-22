package corejava.miscellaneous;

/**
 * Created by Maor on 5/20/2018.
 static method - It is a method which belongs to the class and not to the object(instance).
 A static method can access only static data and can change the value of it.
 It can not access non-static data (instance variables).
 A static method can be accessed directly without creation of an object.
 */
public class Addition {

    static int add(int x, int y){
        return x+y;
    }

    public static void main(String args[]){
        int result = Addition.add(50,5);
        System.out.println(result);
    }
}
