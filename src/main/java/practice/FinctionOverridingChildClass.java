package practice;

/**
 * @author shefali.jain
 */
public class FinctionOverridingChildClass extends FunctionOverridingParentClass{
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        FinctionOverridingChildClass obj = new FinctionOverridingChildClass();
        obj.run();
    }
}
