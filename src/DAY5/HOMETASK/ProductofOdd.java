package DAY5.HOMETASK;

import java.util.Scanner;

 class ProductOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        long product = 1;
        boolean hasOdd = false;

        for (int i = 2; i <= n - 2; i++) {
            if (i % 2 != 0) {
                product *= i;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            System.out.println("Product of odd numbers from 2 to " + (n - 2) + " is: " + product);
        } else {
            System.out.println("No odd numbers found in the range from 2 to " + (n - 2));
        }

        sc.close();
    }
}