package corejava.ArrayToArrayList;

/**
 * Created by Maor on 5/26/2018.
 */

import java.util.ArrayList;

public class ConvertArrayToArrayList2 {

    public static void main (String [] args){

        ArrayList <String> arrList = new ArrayList <String>();
        String array[] = {"Maor","Or","Daniel"};

        // array.length returns the current number of elements present in the array
        for (int i =0;i<array.length;i++)
        {
            //We are adding each array's element to the ArrayList
            arrList.add(array[i]);
        }

        System.out.println(arrList);

	    /*ArrayList content*/
        for (String str: arrList)
        {
            System.out.println(str);
        }
    }
}
