package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author shefali.jain
 */
public class RemoveConsecutiveChars {
    public static void AnagramCheckUsingHashMap1(){
        // removduplicatebyloop();
          remove_repeated_char("javvvvaaaaaak");


    }

    public static void removduplicatebyloop() {

        //removes repeat character from array
        Scanner sc = new Scanner(System.in);
        StringBuffer sf = new StringBuffer();
        System.out.println("enter a string");
        sf.append(sc.nextLine());
        System.out.println("string=" + sf);
        int i = 0;

        while (i < sf.length()) {
            int j = 1 + i;
            while (j < sf.length()) {

                if (sf.charAt(i) == sf.charAt(j)) {
                    sf.deleteCharAt(j);
                } else {
                    j = j + 1;
                }
            }
            i = i + 1;
        }

        System.out.println("string=" + sf);
    }


    private static void remove_repeated_char(String str) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> items = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            Character current = str.charAt(i);
            Integer ocurrence = items.get(current);
            if (ocurrence == null)
                items.put(current, 1);
            else
                items.put(current, ocurrence + 1);
        }

        Set<Map.Entry<Character, Integer>> hashSet = items.entrySet();
        for (Map.Entry entry : hashSet) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }

    }

}
