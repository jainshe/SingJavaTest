package practice;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author shefali.jain
 */
public class HashSetExample {

   public static HashSet<Integer> str1 = new HashSet<Integer>();
    public static TreeSet<String> str2 = new TreeSet<String>();
    public static TreeSet<Integer> str3 = new TreeSet<Integer>();
    //will only print duplicates
    public static void printHashSet(){

        str1.add(6);
        str1.add(5);
        str1.add(91);
        str1.add(91);
        str1.add(93);
        str1.add(9);
        str1.add(3);
        str1.add(94);
        str1.add(95);
        str1.add(55);
        for (int i : str1)
        {
            System.out.println(i);
        }
    }
    public static void printStringinHashset(){
        str2.add("hi");
        str2.add("hello");
        str2.add("hi");
        str2.add("hii");
        str2.add("hiiii");

        for (String i : str2)
        {
            System.out.println(i);
        }
    }
    //will print unique + in sorted manner
    public static void printTreeSet(){
        str3.add(5);
        str3.add(6);
        str3.add(2);
        str3.add(2);
        str3.add(91);
        str3.add(0);
        str3.add(9);
        str3.add(98);
        str3.add(5);
        str3.add(93);
        str3.add(5);
        for (int i : str3)
        {
            System.out.println("Treeset is" + i);
        }
    }

    public static void main(String[] args) {
     printHashSet();
      printTreeSet();
      //  printStringinHashset();
    }




}
