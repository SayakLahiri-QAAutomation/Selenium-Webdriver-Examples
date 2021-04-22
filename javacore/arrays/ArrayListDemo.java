package corejava.arrays;

/**
 * Created by Maor on 5/20/2018.
 Java ArrayList class uses a dynamic array for storing the elements.
 It extends AbstractList class and implements List interface.
 Java ArrayList class can contain duplicate elements.
 Java ArrayList class maintains insertion order.
 Java ArrayList class is non synchronized.
 Java ArrayList allows random access because array works at the index basis.
 */

import java.util.*;

public class ArrayListDemo {

    public static void main(String args[]){
        // creating arraylist
        ArrayList <String> myList = new ArrayList<String>();
        // adding object in to the arraylist
        myList.add("Hod Hasharon");
        myList.add("Tel Aviv");
        myList.add("Natanya");
        myList.add("Kfar Saba");

        // Printing Element with for each loop
        for(String obj:myList)
            System.out.println(obj);

        // get the Index of an Item from the arraylist.
        System.out.println(myList.indexOf("Natanya"));

        // To remove an Item from the arraylist.
        myList.remove(1);

        // To reset value of an arraylist item.
        myList.set(2, "Hifa");

        // getting Iterator from arraylist to traverse elements
        Iterator<String> itr = myList.iterator();

        // Printing each element using Iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Printing Element with for each loop
        for(String obj:myList)
            System.out.println(obj);
    }
}

