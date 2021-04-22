package corejava.ArrayToArrayList;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;
import java.util.Collections;

public class ConvertArrayToArrayList1 {

    public static void main (String [] args){

        String[] students = {"Maor", "Or", "Daniel"};

        ArrayList <String> arrList = new ArrayList <String>();

        // Using Collection.addAll
        Collections.addAll(arrList, students);

        arrList.add("Franko");

        System.out.println(arrList);

    }
}
