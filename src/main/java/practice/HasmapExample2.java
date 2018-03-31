package practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shefali.jain
 */
public class HasmapExample2 {
    public static void AnagramCheckUsingHashMap1(){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        hm.put(102,"Rahul");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

}
