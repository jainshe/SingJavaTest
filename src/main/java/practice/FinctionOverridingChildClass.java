package practice;

/**
 * @author shefali.jain
 */
public class FinctionOverridingChildClass extends FunctionOverridingParentClass{
    void run(){System.out.println("Bike is running safely");}

    public static void AnagramCheckUsingHashMap1(){
        FinctionOverridingChildClass obj = new FinctionOverridingChildClass();
        obj.run();
    }
}
