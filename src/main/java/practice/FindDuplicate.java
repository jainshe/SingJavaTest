package practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shefali.jain
 */
public class FindDuplicate {
    public static void main(String[] args) {
 FindDuplicate findDuplicate = new FindDuplicate();
        findDuplicate.inttest();
    }

    public void strtest(){
        String str[] = {"yogi", "ram", "ram", "yogi", "yogi", "yogi", "raju", "raju", "ram", "yogi",};
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : str) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
                System.out.println("s is " + map.get(s));
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "---" + e.getValue());

        }
    }

    public void inttest() {
        int[] arr = {1, 3, 5, 7, 4, 5, 7};
        int count = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], count + 1);
            } else
                map.put(arr[i], count);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "---" + e.getValue());

        }

    }
}