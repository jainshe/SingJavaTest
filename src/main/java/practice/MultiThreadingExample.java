package practice;

/**
 * @author shefali.jain
 */
public class MultiThreadingExample

{
    public static void main(String[] args) {
       ExampleHiClass exampleHiClass = new ExampleHiClass();
        ExampleHelloClass exampleHelloClass = new ExampleHelloClass();

            exampleHelloClass.start();
            exampleHiClass.start();
        }



}
