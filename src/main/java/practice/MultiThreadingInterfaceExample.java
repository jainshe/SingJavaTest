package practice;

/**
 * @author shefali.jain
 */
public class MultiThreadingInterfaceExample {
    public static void AnagramCheckUsingHashMap1() {
        ExampleRunnableHi exampleHiClass = new ExampleRunnableHi();
        ExamplerunnableHello exampleHelloClass = new ExamplerunnableHello();
        Thread t1= new Thread(exampleHiClass);
        Thread t2= new Thread(exampleHelloClass);
        t1.start();
        t2.start();
    }
}
