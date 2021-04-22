package corejava.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maor on 5/20/2018.
 A HashMap contains values based on the key. It implements
 the Map interface and extends AbstractMap class.
 It contains only unique elements.
 It may have one null key and multiple null values.
 It maintains no order.
 */
public class HashmapExample {

    public static void main(String args[]) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "Hod Hasharon");
        map.put(101, "Tel Aviv");
        map.put(102, "Hifa");

        // Add Element
        map.put(103, "Natanya");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

            // Size of map
            System.out.println(map.size());

            //clears hashmap , removes all element
            map.clear();

            // Remove element from hashmap
            map.remove(100);

            //Checking if HashMap is empty
            System.out.println("Is HashMap is empty: " + map.isEmpty());

            }
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

