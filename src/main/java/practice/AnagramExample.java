package practice;

import java.util.Arrays;

/**
 * @author shefali.jain
 */
public class AnagramExample {

    public static String string11 = "Mother In Law";
    public static String string12 = "Hitler Woman";
    static boolean status = true;

    public static void main(String[] args) {
        String string1 = string11.replaceAll("\\s", "");
        System.out.println(string1);
        String string2 = string12.replaceAll("\\s","");
        System.out.println(string2);


        if(string1!=string2){
           status = false;
        }
        else
        {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array

            char[] s1Array = string1.toLowerCase().toCharArray();

            char[] s2Array = string2.toLowerCase().toCharArray();

            //Sorting both s1Array and s2Array

            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            //Checking whether s1Array and s2Array are equal

            status = Arrays.equals(s1Array, s2Array);
        }

        //Output

        if(status)
        {
            System.out.println(string1+" and "+string2+" are anagrams");
        }
        else
        {
            System.out.println(string1+" and "+string2+" are not anagrams");
        }
        }


}
