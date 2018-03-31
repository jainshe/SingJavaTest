package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shefali.jain
 */
public class HashMapExample {

    public static void AnagramCheckUsingHashMap1() {
       /* Create object of HashMap */

        HashMap<String, String> hashMap = new HashMap<String, String>();

        /* Add entries to hashMap (Keys,Values) */
        hashMap.put("A", "Apple");
        hashMap.put("A", "Book");
        hashMap.put("C", "Car");
        hashMap.put("D", "Dog");
        hashMap.put("E", "Elephant");
        hashMap.put("F", "Flower");

        // Print the content of the hashMap
        Set<Map.Entry<String,String>> hashSet=hashMap.entrySet();
        for(Map.Entry entry:hashSet ) {

            System.out.println(entry.getKey()+""+entry.getValue());
        }
        System.out.println("-----------------------------");
        // Print the size of hashMap
        System.out.println("HashMap size="+hashMap.size());

        // Checking and searching
        if(hashMap.containsKey("X")) {
            System.out.println("HashMap has a key X");
        }else{
            System.out.println("HashMap hasn't a key X");
        }

        // Remove the content of the hashMap
        hashMap.clear();

        // Check if the hashMap empty
        if(hashMap.isEmpty())
        {
            System.out.println("The hashMap is empty");
        }



    }
}
