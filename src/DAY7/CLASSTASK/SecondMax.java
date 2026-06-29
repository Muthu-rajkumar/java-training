package DAY7.CLASSTASK;

public class SecondMax {
        public static void main(String[] args) {
            int num[] = {22, 52, 33, 45, 4};
            int max = num[0];
            int secondMax = Integer.MIN_VALUE;
            for (int i = 1; i < num.length; i++) {
                if (num[i] > max) {
                    secondMax = max;
                    max = num[i];
                } else if (num[i] > secondMax && num[i] != max) {
                    secondMax = num[i];
                }
            }
            System.out.println("Maximum value is: " + max);
            System.out.println("Second maximum value is: " + secondMax);
        }
    }
