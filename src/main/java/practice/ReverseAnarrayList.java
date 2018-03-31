package practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author shefali.jain
 */
public class ReverseAnarrayList {



    public static void AnagramCheckUsingHashMap1()
    {
        ArrayList<String> listOfInts = new ArrayList<String>();
        listOfInts.add("1");
        listOfInts.add("2");
        listOfInts.add("3");
        listOfInts.add("4");
        listOfInts.add("5");
        System.out.println("Before Reversing : " + listOfInts);
        Collections.reverse(listOfInts);
        System.out.println("After Reversing : " + listOfInts); }

   //without reverse method

//    int i = 0;
//    int j = nums.size()-1;
//    while (i < j) {
//        int temp = nums.get(i);
//        nums.set( i, nums.get(j));
//        nums.set( j, temp);
//        i++; j--;
//    }
}
