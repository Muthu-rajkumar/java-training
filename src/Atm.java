import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1.Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Updated Balance = " + balance);
                    break;

                case 3:
                    System.out.print("Enter Amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Updated Balance = " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}