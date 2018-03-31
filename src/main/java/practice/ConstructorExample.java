package practice;

/**
 * @author shefali.jain
 */
public class ConstructorExample {

    public ConstructorExample(){

        System.out.println("Hi");

    }
    //Parametrised constructor
    //constructor overloading
    public ConstructorExample(int i){
        System.out.println(i);
    }

    public ConstructorExample(String k ,int i){
        System.out.println(k);
        System.out.println(i);
    }
    public static void AnagramCheckUsingHashMap1() {
     ConstructorExample constructorExample = new ConstructorExample();
        ConstructorExample constructorExample2 = new ConstructorExample(7);
        ConstructorExample constructorExample1 = new ConstructorExample("Hello",6);
    }

}
