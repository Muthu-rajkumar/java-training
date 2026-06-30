package DAY8HOMETASK;

    import java.util.Scanner;

    public class ParallelArrays {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String[] drinks = {"pepsi", "sprite", "maza", "mountain dew", "campa"};
            int[] prices = {40, 20, 45, 40, 10};
            int[] stock = {10, 15, 8, 20, 5};
            System.out.println("Available Drinks");
            for (int i = 0; i < drinks.length; i++) {
                System.out.println(drinks[i] + " - Price: " + prices[i] + " - Stock: " + stock[i]);
            }

            System.out.print("\nEnter the name of the drink: ");
            String name = sc.nextLine();
            System.out.print("Enter the Quantity: ");
            int qty = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < drinks.length; i++) {

                if (name.equalsIgnoreCase(drinks[i])) {

                    found = true;

                    if (qty <= stock[i]) {

                        int total = prices[i] * qty;
                        stock[i] = stock[i] - qty;

                        System.out.println("Total Price = " + total);
                        System.out.println("Remaining Stock of " + drinks[i] + " = " + stock[i]);

                    } else {
                        System.out.println("Out of Stock");
                        System.out.println("Available Stock = " + stock[i]);
                    }

                    break;
                }
            }

            if (!found) {
                System.out.println("Drink not found.");
            }
            sc.close();
        }

}
