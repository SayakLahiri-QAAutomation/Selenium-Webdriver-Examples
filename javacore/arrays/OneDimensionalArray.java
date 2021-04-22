package corejava.arrays;

/**
 * Created by Maor on 5/20/2018.
 Array is a collection of similar type of elements that have contiguous memory location.
 We can store only fixed set of elements in an array.
 Array is index based, first element of the array is stored at 0 index.
 There are two types of array in java software development language. One Dimensional
 Array and Two Dimensional Array.
 */

public class OneDimensionalArray {

    public static void main(String args[]){

        int a[]={10,20,30,40,50};

        // Printing array
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
