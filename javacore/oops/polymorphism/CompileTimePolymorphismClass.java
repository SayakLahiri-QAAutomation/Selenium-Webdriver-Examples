package corejava.oops.polymorphism;

/**
 * Created by Maor on 5/25/2018.
 */

    public class CompileTimePolymorphismClass {

        void myMethod (int a){
            System.out.println("value of a is " + a);
        }

        void myMethod (int a, int b){
            System.out.println("value of a is " + a + " and value of b is " + b);
        }

        void myMethod (String a){
            System.out.println(a);
        }

        public static void main (String [] args) {
            CompileTimePolymorphismClass obj = new CompileTimePolymorphismClass();
            obj.myMethod(10);
            obj.myMethod(10, 20);
            obj.myMethod("I am a String");
        }
    }

