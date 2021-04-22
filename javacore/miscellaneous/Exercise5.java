package corejava.miscellaneous;

/**
 * Created by Maor on 5/22/2018.
 */

public class Exercise5 {

    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[5];

        DataObject dataObject = new DataObject();
        dataObject.count = 1;
        dataObject.code = "code1";
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 2;
        dataObject.code = "code1";
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 3;
        dataObject.code = "code1";
        dataObjects[2] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 4;
        dataObject.code = "code2";
        dataObjects[3] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 5;
        dataObject.code = "code2";
        dataObjects[4] = dataObject;

        int sum = 0;

        for (int i = 0; i < dataObjects.length; i++) {
            if ("code2".equals(dataObjects[i].code)) {
                sum = sum + dataObjects[i].count;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
