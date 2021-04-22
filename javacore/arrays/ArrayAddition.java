package corejava.arrays;

/**
 * Created by Maor on 5/22/2018.
 */

public class ArrayAddition {

    public static void main(String args[]) {

        // Creating two matrices
        int a[][] = {{1, 3, 4}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {3, 4, 5}};

        // Creating another matrix to store the sum of two matrices
        int c[][] = new int[2][3];

        // Adding and printing addition of 2 matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
