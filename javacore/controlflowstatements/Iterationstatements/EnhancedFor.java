package corejava.controlflowstatements.Iterationstatements;

/**
 * Created by Maor on 6/2/2018.
 */

/* It is mainly used to traverse array or collection elements.
The advantage of EnhancedFor loop is that it eliminates the
possibility of bugs and makes the code more readable.*/


public class EnhancedFor {

    public static void main(String args[]){

        int a[]={1,2,3,4,5,6,7,8,9,10};

        for(int i:a){
            System.out.println(i);
        }
    }
}