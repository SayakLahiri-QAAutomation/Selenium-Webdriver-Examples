package corejava.interfaces;

/**
 * Created by Maor on 6/3/2018.
 */

public interface MyInterfaceTwo extends MyInterfaceOne{

    // Compiler treats it as public abstract void myMethodTwo();
    // Below method has no body
    public void myMethodTwo();
}