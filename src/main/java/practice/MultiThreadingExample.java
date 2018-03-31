package practice;

/**
 * @author shefali.jain
 */
public class MultiThreadingExample

{
    public static void AnagramCheckUsingHashMap1() {
       ExampleHiClass exampleHiClass = new ExampleHiClass();
        ExampleHelloClass exampleHelloClass = new ExampleHelloClass();

            exampleHelloClass.start();
            exampleHiClass.start();
        }



}
