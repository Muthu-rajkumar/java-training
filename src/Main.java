import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            product = product * i;
        }

        System.out.println(product);
        sc.close();
    }
}

