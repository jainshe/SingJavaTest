package practice;

import java.util.Scanner;

/**
 * @author shefali.jain
 */
public class Fabonacci {

    public static void AnagramCheckUsingHashMap1() {
        int k,a,b;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a value");
        int n = scn.nextInt();
        k=0;
        a= 1;
        b=1;
        System.out.println(a + "\n" +b);
        while(k<=n){
            k= a+b;
            if(k>=n)
            break;
            System.out.println(k);
            a=b;
            b=k;
        }
    }
}
