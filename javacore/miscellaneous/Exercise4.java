package corejava.miscellaneous;

/**
 * Created by Maor on 5/22/2018.
 */

public class Exercise4 {

    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[2];

        DataObject dataObject = new DataObject();
        dataObject.count = 1;
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 2;
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 3;
        dataObjects[2] = dataObject;

        int sum = 0;

        for(int i = 0; i< dataObjects.length; i++) {
            sum = sum + dataObject.count;
            System.out.println(sum);
        }
    }
}
