package corejava.arraylist;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;

public class ArrayListEForClass {

    public static void main(String [] args){

        ArrayList arrList = new ArrayList();

        // Adding elements to the array list
        arrList.add(1234);
        arrList.add("Maor");
        arrList.add(99.99);

        for (Object arrListItem : arrList){
            System.out.println("Value of Array List at the index "+ arrList.indexOf(arrListItem)+" is "+ arrListItem);
        }
    }
}
