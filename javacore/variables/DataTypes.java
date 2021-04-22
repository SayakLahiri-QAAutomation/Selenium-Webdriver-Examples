package corejava.variables;

/**
 * Created by Maor on 5/23/2018.
 */
public class DataTypes {

    public static void main(String[] args) {

        //Change the value of byte data type to 128 and you will find an error.
        // The range of byte is from -128 to 128
        byte byteDataType = 127;
        System.out.println(byteDataType);


        //Change the value of byte data type to 32768 and you will find an error.
        // The range of byte is from -32768 to 32767
        //short shortDataTypeNew = 32768;
        short shortDataType = 32767;
        System.out.println(shortDataType);

        int intDataType = 32768;
        System.out.println(intDataType);

        long longDataType = 2147483648L;
        System.out.println(longDataType);

        float floatDataType = 20.99F;
        System.out.println(floatDataType);

        double doubleDataType = 49999999.9d;
        System.out.println(doubleDataType);

        char charDataType = 'M';
        System.out.println(charDataType);

        boolean booleanDataType = true;
        System.out.println(booleanDataType);

    }
}
