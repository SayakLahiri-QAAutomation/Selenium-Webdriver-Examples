package corejava.arraylist;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

        ArrayList arrList = new ArrayList();

        // We can use any data type
        arrList.add(1234);

        // Here i am passing next two values as "Maor" just to show you that List
        // allows duplicate values..
        // Set wont allow duplicate values.
        // Adding elements to the array list
        arrList.add("Maor");
        arrList.add("Maor");
        arrList.add(99.99);

        // To get all the values from the list
        System.out.println(arrList);

        // To get a value whose index is 3
        System.out.println(arrList.get(3));

    }
}