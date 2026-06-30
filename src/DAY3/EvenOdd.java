package DAY3;

import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if(n >0){
            if(n % 2 == 0){
                System.out.println("Positive even");
            }else{
                System.out.println("Positive odd");
            }
        }else if(n<0){
            if(n %2 == 0){
                System.out.println("Negative even");
            }else{
                System.out.println("Negative odd");
            }
        }
        sc.close();
    }
}