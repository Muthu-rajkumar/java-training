package DAY10.CLASSTASK.HOMETASK;

    import java.util.Scanner;

    class Drink {
        int id;
        String name;
        int price;
        int stock;

        static String shopName = "Cool Drinks Shop";

        Drink(int id, String name, int price, int stock) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        void display() {
            System.out.println(id + " " + name + " Price:" + price + " Stock:" + stock);
        }

        boolean checkStock(int qty) {
            return stock >= qty;
        }

        int purchase(int qty) {
            stock -= qty;
            return qty * price;
        }
    }

    public class DrinkShop {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Drink[] drinks = {
                    new Drink(1, "Pepsi", 60, 5),
                    new Drink(2, "Sprite", 20, 5),
                    new Drink(3, "Maaza", 40, 5),
                    new Drink(4, "Mountain Dew", 50, 5),
                    new Drink(5, "Campa", 10, 5)
            };

            int totalBill = 0;

            while (true) {

                System.out.println("\nAvailable Drinks");
                for (Drink d : drinks) {
                    d.display();
                }

                System.out.print("Enter Drink Name (or exit): ");
                String name = sc.nextLine();

                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();

                boolean found = false;

                for (Drink d : drinks) {
                    if (d.name.equalsIgnoreCase(name)) {
                        found = true;

                        if (d.checkStock(qty)) {
                            int bill = d.purchase(qty);
                            totalBill += bill;
                            System.out.println("Purchase Successful");
                            System.out.println("Bill Amount = " + bill);
                        } else {
                            System.out.println("Insufficient Stock");
                        }
                    }
                }

                if (!found) {
                    System.out.println("Drink Not Found");
                }
            }

            System.out.println("\nTotal Bill = " + totalBill);

            System.out.println("\nRemaining Stock");
            for (Drink d : drinks) {
                System.out.println(d.name + " : " + d.stock);
            }

            sc.close();
        }
    }
