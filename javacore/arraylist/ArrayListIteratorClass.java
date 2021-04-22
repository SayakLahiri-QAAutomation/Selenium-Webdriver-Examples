package corejava.arraylist;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorClass {

    public static void main(String [] args){

        ArrayList arrList = new ArrayList();

        // Adding elements to the array list
        arrList.add(1234);
        arrList.add("Maor");
        arrList.add(99.99);

        Iterator itr = arrList.iterator();

        while (itr.hasNext()){
            Object value=itr.next();
            System.out.println("Values are " +value);
        }
    }
}
