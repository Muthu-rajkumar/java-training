package DAY7.CLASSTASK;

public class Product {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int product = 1;

        for (int i = 0; i < 5; i++) {
            product *= arr[i];
            System.out.println(product);
        }

        System.out.println("FINAL :" + product);
    }
}

