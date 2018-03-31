package practice;

/**
 * @author shefali.jain
 */
public class Overloading {
    static int add(int a,int b){return a+b;}
    static double add(int a,int b,int c){return a+b+c;}

    public static void AnagramCheckUsingHashMap1(){
        System.out.println(Overloading.add(11,11));
        System.out.println(Overloading.add(11,11,11));
    }

//    public static void main(String args){System.out.println("main with String");}
//    public static void main(){System.out.println("main without args");}
}
