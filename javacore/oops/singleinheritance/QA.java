package corejava.oops.singleinheritance;

/**
 * Created by Maor on 5/25/2018.
 */

public class QA extends Employee {

        String fullName = "Maor Segev";

        public static void main(String [] args){

            QA objName = new QA();

            System.out.println(objName.firstname);
            System.out.println(objName.fullName);

        }
}
