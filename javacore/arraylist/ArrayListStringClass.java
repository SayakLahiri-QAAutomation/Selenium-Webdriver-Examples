package corejava.arraylist;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;

public class ArrayListStringClass {

    public static void main(String [] args){

        // Creation of ArrayList with String elements
        ArrayList <String> arrList = new ArrayList <String>();

        // Adding elements to the array list
        arrList.add("Maor");
        arrList.add("Segev");
        arrList.add("Hi");

        for (String arrListItem:arrList){
            System.out.println(arrListItem);
        }
    }
}
