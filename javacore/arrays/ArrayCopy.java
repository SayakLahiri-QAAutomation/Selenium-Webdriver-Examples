package corejava.arrays;

/**
 * Created by Maor on 5/22/2018.
 */

public class ArrayCopy {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 5);
        System.out.println(new String(copyTo));
    }
}