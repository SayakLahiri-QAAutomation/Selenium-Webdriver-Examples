package corejava.oops.polymorphism;

/**
 * Created by Maor on 5/26/2018.
 */

// Overload a method with different sequence of a data types
public class MethodOverloadingDiffSeqDataTypes {

    public void methodOne(int a, String b){
        System.out.println(a + b);
    }

    public void methodOne(String a, int b)
    {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        MethodOverloadingDiffSeqDataTypes obj = new MethodOverloadingDiffSeqDataTypes();

        obj.methodOne(1, " Int and String params");
        obj.methodOne("String and Int params ", 2);

    }
}
