import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {
            int prime = 1;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = 0;
                    break;
                }
            }

            if (prime == 1) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}