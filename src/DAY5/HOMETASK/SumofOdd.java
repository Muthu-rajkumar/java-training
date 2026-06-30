package DAY5.HOMETASK;

import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n - 1; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to " + (n - 1) + " is: " + sum);
        sc.close();
    }
}