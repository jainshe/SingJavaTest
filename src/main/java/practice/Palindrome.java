package practice;

import java.util.Scanner;

/**
 * @author shefali.jain
 */
public class Palindrome {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();

        int  r, s=0;
        int t = n;
        while(n>0){
            r= n%10;
            n= n/10;
            s=s*10+r;
    }
        System.out.println(s);

        if(t==s){
            System.out.println("Number is palindrome");
        }
        else
            System.out.println("Number is not palindrome");


    }
}
