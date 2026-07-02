package DAY9;

import java.util.Scanner;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String s="madam";


        char[] ch=new char[s.length()];
        int n=s.length();

        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(n-1-i);
        }
        System.out.print(Arrays.toString(ch));
    }
}