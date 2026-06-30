package DAY8.CLASSTASK;

public class SecondMax {
    public static void main(String[] args) {
        int[] num = {22, 52, 33, 42, 4};

        int max = num[0];
        int secondMax = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > secondMax && num[i] < max) {
                secondMax = num[i];
            }
        }
        System.out.println("Maximum value : " + max);
        System.out.println("Second maximum value : " + secondMax);
    }
}

