package corejava.arrays;

/**
 * Created by Maor on 5/20/2018.
 Two dimensional array is just like
 spreadsheet with multiple rows and columns having different data in each cell.
 */
public class TwoDimensionalArray {

    public static void main(String args[]){

        // Declaring and initializing 2D array
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

        // Printing 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}