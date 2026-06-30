package DAY8.CLASSTASK;

import java.util.Scanner;

public class ParrelArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] drinks = {"PEPSI","SPPRITE","MAAZA","COKE","CAMPA"};
        int[] prices = {50,40,30,50,45};

        System.out.println("Available Drinks: PEPSI, SPPRITE, MAAZA, COKE, CAMPA");
        System.out.println("ENTER THE NAME OF THE DRINK:");
        String name = sc.nextLine();
        System.out.println("ENTER THE QUANTITY:");
        int qty = sc.nextInt();

        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i].equals(name)) {
                int total = prices[i] * qty;
                System.out.println("Total Price = " + total);
            }
        }

        sc.close();
    }
}
