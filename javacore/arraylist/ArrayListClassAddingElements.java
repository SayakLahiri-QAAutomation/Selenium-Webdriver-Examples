package corejava.arraylist;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;

public class ArrayListClassAddingElements {

    // How to add elements at a given index using ArrayList
    public static void main(String [] args){

        // Creation of ArrayList with String elements
        ArrayList <String> arrList = new ArrayList <String>();

        // Adding elements to the array list
        arrList.add(0, "Maor");
        arrList.add(1, "Segev");
        System.out.println(arrList);

        //Remove elements from array list like this
        arrList.remove("Segev");
        System.out.println(arrList);

        arrList.add(1, "Segev");
        System.out.println(arrList);

        arrList.remove(0);
        System.out.println(arrList);

    }
}
