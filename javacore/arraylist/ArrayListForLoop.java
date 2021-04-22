package corejava.arraylist;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;

public class ArrayListForLoop {

    public static void main(String[] args) {

        ArrayList arrList = new ArrayList();

        // Adding elements to the array list
        arrList.add(1234);
        arrList.add("Segev");
        arrList.add("Segev");
        arrList.add(99.99);

        int listSize = arrList.size();

        // Print all ArrayList elements using a For loop
        for (int i = 0; i < listSize; i++) {
            System.out.println("Value of Array List at the index " + i + " is " + arrList.get(i));
        }
    }
}
