package DAY7.CLASSTASK;

public class Max {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 5, 4};

        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maximum value is: " + max);
    }
}
