package DAY3;

import java.util.Scanner;
public class Equal{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a>90 ){
            System.out.println("Greater than 90");
        }else if(a>50 ){
            System.out.println("Greater than 50");
        }else if(a>10){
            System.out.println("Greater than 100");
        }
        sc.close();
    }
}