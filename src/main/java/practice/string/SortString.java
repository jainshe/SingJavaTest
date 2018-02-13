package practice.string;

/**
 * @author shefali.jain
 */
public class SortString {


    public void sortString1(String str){
        char[] charArray = str.toCharArray();
        char temp;
        for (int i=0;i<charArray.length-1;i++){
            for (int j= i+1;j<charArray.length-1;j++){
                if(charArray[i]>charArray[j]){
                    temp = charArray[j] ;
                    charArray[j]=charArray[i];
                    charArray[i]=temp;
                }
            }
        }
        System.out.println(charArray);
    }
    public static void main(String[] args) {
        SortString sortString = new SortString();
        sortString.sortString1("geekforgeek");
    }
}
