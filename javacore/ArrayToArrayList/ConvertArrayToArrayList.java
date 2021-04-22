package corejava.ArrayToArrayList;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

    public static void main (String [] args){

        // Using asList
        String[] students = {"Maor", "Or", "Daniel"};

        ArrayList <String> arrList = new ArrayList <>(Arrays.asList(students));

        arrList.add("Franko");
        arrList.add("Gonzales");

        System.out.println(arrList);
        System.out.println(arrList.get(2));

    }
}
