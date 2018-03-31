package practice;

/**
 * @author shefali.jain
 */
public class SubstringExample {
    public static String inputString = "knowbutuknowknow";
    public static String subString = "knowb";
   public static  String[][] stringArray = new String[][]{{"apple","apple"},{"banana","anything","banana"}};
    public static String[] substringArray = {"apple","apple","banana","banana","banana"};


    public static void AnagramCheckUsingHashMap1() {
        SubstringExample substringExample = new SubstringExample();
        substringExample.returnNoOfsubstringsStrings();
        substringExample.returnNoOfSubStringsinArray();
    }
     public int returnNoOfsubstringsStrings() {
         int matches = 0;
         for (int outer = 0; outer <= inputString.length() - subString.length(); outer++) {
             for (int inner = 0; inner < subString.length(); inner++) {
                 if (inputString.charAt(outer + inner) == subString.charAt(inner)) {
                     // letter matched, proceed.
                     if (inner == subString.length() - 1) {
                         //last letter matched, so a word match at position "outer"
                         matches++;
                         //proceed with outer. Room for improvement: Skip next n chars beeing
                         // part of the match already.
                         break;
                     }
                 } else {
                     //no match for "outer" position, proceed to next char.
                     break;
                 }
             }
         }
         System.out.println(matches);
         return matches;
     }

    public int returnNoOfSubStringsinArray() {
        int matches = 0;
        for (int outer = 0; outer <= stringArray.length - substringArray.length; outer++) {
            for (int inner = 0; inner < substringArray.length; inner++) {
                if (stringArray[outer + inner].equals(substringArray[inner])) {
                    // letter matched, proceed.
                    if (inner == substringArray.length - 1) {
                        //last letter matched, so a word match at position "outer"
                        matches++;
                        //proceed with outer. Room for improvement: Skip next n chars beeing
                        // part of the match already.
                        break;
                    }
                } else {
                    //no match for "outer" position, proceed to next char.
                    break;
                }
            }
        }
        System.out.println(matches);
        return matches;
    }

}
